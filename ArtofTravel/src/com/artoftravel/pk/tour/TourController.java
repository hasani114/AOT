package com.artoftravel.pk.tour;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
			
			if (request.getQueryString().contains("edittour")) {
				
				//Get Tour ID
								
				System.out.println("in edit block");
				String tourid = request.getParameter("edittour");
				Tourdao getTour = new Tourdao();
				
				//Get Tour Details from Tour ID

				TourModel tour = getTour.getTourByID(tourid);
				
				//Send Tour Object in Session to edit-tour.jsp
				
				request.setAttribute("tour", tour);

				RequestDispatcher res = request.getRequestDispatcher("/Admin/edit-tour.jsp");
				res.forward(request, response);		
				
			}
		
		
        
        Map params = request.getParameterMap();
        Set allparams = params.keySet();
        
        if (allparams.contains("searchform")) {
      
        String tourlocation = "";
        String country = "";
        String tourprice = request.getParameter("tourprice");
        String tourduration = request.getParameter("tourduration");
       
       if (allparams.contains("tourlocation")) {
        	tourlocation = request.getParameter("tourlocation");
			System.out.println("Set TourLocation Variable:" + tourlocation);

        }  
       if (allparams.contains("country")) {
       	country = request.getParameter("country");
			System.out.println("Set TourLocation Variable:" + country);

       }  

        
        
        
        if (allparams.contains("tourduration")) {
        	
        	int duration = Integer.parseInt(request.getParameter("tourduration"));
        	int price = Integer.parseInt(request.getParameter("tourprice"));

        	
        	Tourdao database = new Tourdao();
			ArrayList<TourModel> tourlist = database.searchTours(duration, price, tourlocation, country);
			
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

		
		

		

	
			
				
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		// Getting paratmeter from post request and creating variables to send to the TourModel Class.
			
		String tourname = request.getParameter("tourname");
		String tourlocation = request.getParameter("tourlocation");
		String country = request.getParameter("country");
		int groupsize = Integer.parseInt(request.getParameter("groupsize"));
		
		
		int tourprice;
		if (request.getParameter("tourprice").isEmpty() || request.getParameter("tourprice").isBlank()) {
			tourprice = 0;
		} else tourprice = Integer.parseInt(request.getParameter("tourprice"));
		
		
		int tourduration = Integer.parseInt(request.getParameter("tourduration"));
		String tourdescription = request.getParameter("tourdescription");
		String tourbanner = request.getParameter("tourbanner");
		String date = request.getParameter("tourdate");

	    Date date1 = null;
		try {
			date1 = new SimpleDateFormat("MM/dd/yyyy").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}  

		

		
		
		
		// Create an instance of TourModel and pass the values retreived from the parameters above
		// Create instance of database helper class and call its add new tour method to update the database with the new entry
		
		TourModel tour = new TourModel(tourname, tourlocation, country, groupsize, tourprice, tourduration, tourdescription, tourbanner, date1);		
		Tourdao dbUpdate = new Tourdao();
		dbUpdate.addNewTour(tour);
		
		
		
		// After processing update to database forwarding request to viewtours page
		
		response.sendRedirect("/ArtofTravel/TourController?viewAll");
		
		
		
		
		
		
		
	
		
	}

}
