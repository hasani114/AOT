package com.artoftrael.pk.user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/UserController", "/Admin/UserController"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UserController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at Main Controller: ").append(request.getContextPath());	

    	if (request.getQueryString().contentEquals("viewUsers")) {
    		
    		UserOperation ope = new UserOperation();
    		request.setAttribute("viewUsers", ope.viewUsers());		
    		RequestDispatcher resq = request.getRequestDispatcher("/Admin/users.jsp");
    		resq.forward(request, response);
    		
    	}
    	
    	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
		// Check to see request is to add the user and get parameters from form submitted
		if (request.getQueryString().equalsIgnoreCase("adduser")) {	

		String firstname = request.getParameter("userfirstname");
		String lastname = request.getParameter("userlastname");
		String email = request.getParameter("useremail");
		String phonenumber = request.getParameter("userphone");
		String gender = request.getParameter("usergender");
		String password = request.getParameter("userpassword");
		
		// Create User Object
		UserModel user = new UserModel(firstname, lastname, email, phonenumber, gender, password);
		
		// Call the method to add user to the database
		UserOperation.AddNewUser(user);
		
		//Get UserInfo
		user = UserOperation.getUserInfo(email);
		HttpSession session = request.getSession();
		session.setAttribute("User", true);
		session.setAttribute("Name", user.getUserFirstName());
		session.setAttribute("UserID", user.getUserId());
	


		// redirect the new user to the home page
		response.sendRedirect("/ArtofTravel");
		} 
		
		
		
		
		//Check to see request is to log in the user and get parameters from form submitted
		if (request.getQueryString().equalsIgnoreCase("loginrequest")) {	
			
			String username = request.getParameter("username").toLowerCase();
			String password = request.getParameter("password");
			
			boolean isValid = UserOperation.AuthenticateUser(username, password);
			
			if (isValid == true) {
				
				UserModel user = UserOperation.getUserInfo(username);
				
				HttpSession session = request.getSession();
				session.setAttribute("User", true);
				session.setAttribute("Name", user.getUserFirstName());
				session.setAttribute("UserID", user.getUserId());
				}
			
			request.setAttribute("ValidUser", isValid);		
    		RequestDispatcher resq = request.getRequestDispatcher("LoggedIn.jsp");
    		resq.forward(request, response);
    		
			
			
			/*
			 * if (auth.equals(true)) {
			 * 
			 * HttpSession session = request.getSession(); session.setAttribute("Username",
			 * username);
			 * 
			 * response.sendRedirect("logintest.jsp"); } else
			 * response.sendRedirect("Login.jsp");
			 */
			
		}
		
		
		
	} 
	
		
	}
	
	
	


