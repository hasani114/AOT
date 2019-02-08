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

import com.artoftravel.pk.model.TourModel;


@WebServlet("/TourController")
public class TourController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public TourController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at 2123: ").append(request.getContextPath());	
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String tourname = request.getParameter("tourname");
		String country = request.getParameter("country");
		String tourlocation = request.getParameter("tourlocation");
		String groupsize = request.getParameter("groupsize");
		String tourprice = request.getParameter("tourprice");
		String tourdays = request.getParameter("tourdays");
		String tourdescription = request.getParameter("tourdescription");
		
		
		// Cast the Strings Groupsize, Number of Days, Tour Price to Int and Doubles
		int grpsize = Integer.parseInt(groupsize);
		int numdays = Integer.parseInt(tourdays);
		double tourpric = Integer.parseInt(tourprice);

		

		request.setAttribute("tourname", tourname);
		request.setAttribute("country", country);
		request.setAttribute("tourlocation", tourlocation);
		request.setAttribute("groupsize", groupsize);
		request.setAttribute("tourprice", tourprice);
		request.setAttribute("tourdays", tourdays);
		request.setAttribute("tourdescription", tourdescription);
		
		GregorianCalendar cal = new GregorianCalendar();
		
		
		
		
		
		TourModel tourdata = new TourModel();
		
		

		
		RequestDispatcher res = request.getRequestDispatcher("/confirmtour.jsp");
		res.forward(request, response);
		
		
	}

}
