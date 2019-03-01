package com.artoftravel.pk.tour;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.artoftravel.pk.reservations.ReservationModel;
import com.artoftravel.pk.tour.*;


@WebServlet("/TourController")
public class TourController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public TourController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		
		if (request.getQueryString().contains("delete")) {
			String deletetour = request.getParameter("delete");
			
			Tourdao database = new Tourdao();
			database.deleteTour(deletetour);
			
			
		// After processing update to database forwarding request to viewtours page
		
			RequestDispatcher res = request.getRequestDispatcher("/Admin/viewtours.jsp");
			res.forward(request, response);				
			
		}
		
		if (request.getQueryString().contains("viewAll")) {
			
			Tourdao database = new Tourdao();
			ArrayList<TourModel> tourlist = database.viewAllTours();
			
			Iterator it = tourlist.iterator();
			
			while (it.hasNext()) {
				
			
				TourModel tour = (TourModel) it.next();
				ArrayList<ReservationModel> reservations = tour.getReservations();
				System.out.println("Tour Name: " + tour.getTourname());
				System.out.println("Tour ID: " + tour.getTourID());
					
				Iterator resit = reservations.iterator();
				
				for (int i=0; i<reservations.size(); i++) {
					
						ReservationModel res = (ReservationModel) resit.next();
						System.out.println("Reservation ID : " + res.getReservationID() + "Reservation Attendees : " + res.getNumberofattendees() + "Reservation Status : " + res.getReservationstatus() );
				
						i++;
				}
				
				System.out.println("Ended Tour Loop Try");

				
				
				
			}
			
			request.setAttribute("tourlist", tourlist);
			
			RequestDispatcher res = request.getRequestDispatcher("/tours.jsp");
			res.forward(request, response);
		}
			
		
			if (request.getQueryString().contains("admintours")) {
			
			Tourdao database = new Tourdao();
			ArrayList<TourModel> tourlist = database.viewAllTours();
			
			
			
			request.setAttribute("tourlist", tourlist);
			
			RequestDispatcher res = request.getRequestDispatcher("/Admin/tours.jsp");
			res.forward(request, response);
		}
			
		
		
		
		
		
		// SEARCH STARTS HERE
		
		
		
		// See which search terms have value
		
		/*
		 * String searchtourname = request.getParameter("tourname");
		 * System.out.print(searchtourname);
		 * 
		 * if (searchtourname.isEmpty()) {
		 * 
		 * System.out.print("Empty Search Criteria"); } else if
		 * (searchtourname.isBlank()) { System.out.print("Blank Search Criteria");
		 * 
		 * }
		 */
		//Getting all the parameter names
		
		Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String parameterName = (String) enumeration.nextElement();
			System.out.println(parameterName);
			
        }
        
        Map params = request.getParameterMap();
        Set allparams = params.keySet();
        
        if (allparams.contains("searchform")) {
      
        String tourname = "";	
        String tourlocation = "";
        String tourprice = request.getParameter("tourprice");
        String tourduration = request.getParameter("tourduration");
       
        if (allparams.contains("tourname")) {
        	
        	if (request.getParameter("tourname").isBlank() && request.getParameter("tourname").isEmpty()) {
            	tourname = "All Tours";
        	}
        	tourname = request.getParameter("tourname");
			System.out.println("Set Tourname Variable:" + tourname);

        } if (allparams.contains("tourlocation")) {
        	tourlocation = request.getParameter("tourlocation");
			System.out.println("Set TourLocation Variable:" + tourlocation);

        }  

        System.out.println("Printing outside the if: " + tourname);
        
        
        
        if (allparams.contains("tourduration")) {
        	
        	String duration = request.getParameter("tourduration");
        	String price = request.getParameter("tourprice");

        	
        	Tourdao database = new Tourdao();
			ArrayList<TourModel> tourlist = database.searchTours(duration, price, tourname);
			
			request.setAttribute("tourlist", tourlist);
			request.setAttribute("tourprice", price);
			request.setAttribute("tourduration", duration);

			
			RequestDispatcher res = request.getRequestDispatcher("/tours.jsp");
			res.forward(request, response);
        	
        }
        
        
        
		
        }
        
        
        if (request.getQueryString().contains("tourdetails")) {
        	
        	Tourdao database = new Tourdao();
        	TourModel tour = database.getTourByID(request.getParameter("tourid"));
        	request.setAttribute("tour", tour);
        	
        	RequestDispatcher res = request.getRequestDispatcher("/tour-details.jsp");
			res.forward(request, response);
        	
        }
        
        
		}
		//Find out which parameters are not blank
		
		//Pass params that are not blank to search method
		
		//Retreive results and send to page
		
		

		

	
			
				
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		// Getting paratmeter from post request and creating variables to send to the TourModel Class.
			
		String tourname = request.getParameter("tourname");
		String tourlocation = request.getParameter("tourlocation");
		String country = request.getParameter("country");
		String groupsize = request.getParameter("groupsize");
		String tourprice = request.getParameter("tourprice");
		String tourduration = request.getParameter("tourduration");
		String tourdescription = request.getParameter("tourdescription");
		
		
		
		// Create an instance of TourModel and pass the values retreived from the parameters above
		// Create instance of database helper class and call its add new tour method to update the database with the new entry
		
		TourModel tour = new TourModel(tourname, tourlocation, country, groupsize, tourprice, tourduration, tourdescription);		
		Tourdao dbUpdate = new Tourdao();
		dbUpdate.addNewTour(tour);
		
		
		
		// After processing update to database forwarding request to viewtours page
		
		response.sendRedirect("/ArtofTravel/TourController?viewAll");
		
		
		
		
		
		
		
		
		
		/*
		 * request.setAttribute("tourname", tourname); request.setAttribute("country",
		 * country); request.setAttribute("tourlocation", tourlocation);
		 * request.setAttribute("groupsize", groupsize);
		 * request.setAttribute("tourprice", tourprice);
		 * request.setAttribute("tourduration", tourduration);
		 * request.setAttribute("tourdescription", tourdescription);
		 */
		
		// Cast the Strings Groupsize, Number of Days, Tour Price to Int and Doubles
//		int grpsize = Integer.parseInt(groupsize);
//		int numdays = Integer.parseInt(tourduration);
//		double tourpric = Integer.parseInt(tourprice);
		
		
	}

}
