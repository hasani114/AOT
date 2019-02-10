package com.artoftravel.pk;

import java.io.IOException;
import java.io.PrintWriter;
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
		response.getWriter().append("Served at Tour Controller: ").append(request.getContextPath());		
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
			
		String tourname = request.getParameter("tourname");
		String tourlocation = request.getParameter("tourlocation");
		String country = request.getParameter("country");
		String groupsize = request.getParameter("groupsize");
		String tourprice = request.getParameter("tourprice");
		String tourduration = request.getParameter("tourduration");
		String tourdescription = request.getParameter("tourdescription");
		
		
		// Cast the Strings Groupsize, Number of Days, Tour Price to Int and Doubles
//		int grpsize = Integer.parseInt(groupsize);
//		int numdays = Integer.parseInt(tourduration);
//		double tourpric = Integer.parseInt(tourprice);
		
		TourModel tour = new TourModel(tourname, tourlocation, country, groupsize, tourprice, tourduration, tourdescription);
		
		DatabaseHelper dbUpdate = new DatabaseHelper();
		dbUpdate.tourUpdate(tour);
		

		request.setAttribute("tourname", tourname);
		request.setAttribute("country", country);
		request.setAttribute("tourlocation", tourlocation);
		request.setAttribute("groupsize", groupsize);
		request.setAttribute("tourprice", tourprice);
		request.setAttribute("tourduration", tourduration);
		request.setAttribute("tourdescription", tourdescription);
		
		
		
		RequestDispatcher res = request.getRequestDispatcher("/confirmtour.jsp");
		res.forward(request, response);				
		

		

		
		
	}

}
