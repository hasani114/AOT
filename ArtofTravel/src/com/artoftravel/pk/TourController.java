package com.artoftravel.pk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.GregorianCalendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.artoftravel.pk.model.*;


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
			
			DatabaseHelper database = new DatabaseHelper();
			database.deleteTour(deletetour);
			
			
		// After processing update to database forwarding request to viewtours page
		
			RequestDispatcher res = request.getRequestDispatcher("/viewtours.jsp");
			res.forward(request, response);				
			
		}
		
		response.getWriter().append("Served at Tour Controller: ").append(request.getContextPath());		

				
		
		
	}

	
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
		DatabaseHelper dbUpdate = new DatabaseHelper();
		dbUpdate.addNewTour(tour);
		
		
		
		// After processing update to database forwarding request to viewtours page
		
		RequestDispatcher res = request.getRequestDispatcher("/viewtours.jsp");
		res.forward(request, response);			
		
		
		
		
		
		
		
		
		
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
