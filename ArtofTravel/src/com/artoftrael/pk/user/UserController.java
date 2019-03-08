package com.artoftrael.pk.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

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
       
 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    	// View Users Returns an ArrayList of Users
    	if (request.getQueryString().equalsIgnoreCase("viewusers")) {
    		
    		Userdao ope = new Userdao();
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
		Userdao.AddNewUser(user);
		
		//Get UserInfo
		user = Userdao.getUserInfo(email);
		HttpSession session = request.getSession();
		session.setAttribute("User", true);
		session.setAttribute("Name", user.getUserFirstName());
		session.setAttribute("UserID", user.getUserId());
		session.setAttribute("Email", user.getUserEmail());
		session.setAttribute("Phone", user.getUserPhone());
		session.setAttribute("Role", user.getUserRole());

	


		// redirect the new user to the home page
		response.sendRedirect("/ArtofTravel");
		} 
		
		
		
		
		//Check to see request is to log in the user and get parameters from form submitted
		if (request.getQueryString().equalsIgnoreCase("loginrequest")) {	
			
			String username = request.getParameter("username").toLowerCase();
			String password = request.getParameter("password");
			
			boolean isValid = Userdao.AuthenticateUser(username, password);
			
			if (isValid == true) {
				
				UserModel user = Userdao.getUserInfo(username);
				
				HttpSession session = request.getSession();
				session.setAttribute("User", true);
				session.setAttribute("Name", user.getUserFirstName() + " " + user.getUserLastName());
				session.setAttribute("UserID", user.getUserId());
				session.setAttribute("Email", user.getUserEmail());
				session.setAttribute("Phone", user.getUserPhone());
				session.setAttribute("Role", user.getUserRole());

				}
			
			request.setAttribute("ValidUser", isValid);	
			
			 Map params = request.getParameterMap();
			
			 
			if (request.getParameter("redirect").isEmpty()) {
				
				RequestDispatcher resq = request.getRequestDispatcher("/Users/profile.jsp");
	    		resq.forward(request, response);
				
			} else  { 	 response.sendRedirect(request.getParameter("redirect"));

			}
    		
			
		}
		
		
		
	} 
	
		
	}
	
	
	


