package com.artoftravel.pk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at Main Controller: ").append(request.getContextPath());
		
		
		/*
		 * if (request.getPathInfo().contains("js.jsp")) { //Get Values from Request
		 * from User String[] allAct = request.getParameterValues("Activities");
		 * 
		 * //Convert Array into String String activities = ""; for (int
		 * i=0;i<allAct.length;i++) { System.out.println(allAct[i]); activities =
		 * activities + allAct[i] + ","; }
		 * 
		 * // Send String to Object/Save to DB
		 * System.out.println("All Activities Selected :" + activities);
		 * 
		 * 
		 * //Search Query
		 * 
		 * String Query = "select tour_id from tour_activities where tour_act like ";
		 * 
		 * for (int i=0;i<allAct.length-1; i++) {
		 * 
		 * Query = Query + "%"+allAct[i]+"%" + " or "; }
		 * 
		 * int Last = allAct.length; Query = Query + "%"+allAct[Last-1]+"%;";
		 * 
		 * System.out.println(Query);
		 * 
		 * }
		 */
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
				
		
			if (request.getQueryString().equalsIgnoreCase("addtour")) {		
			RequestDispatcher res = request.getRequestDispatcher("/TourController");
			res.forward(request, response);
		} else request.getRequestDispatcher("/index.jsp");
			
	
				
		
			
			

	}

}
