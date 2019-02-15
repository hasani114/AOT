package com.artoftrael.pk.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UserController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at Main Controller: ").append(request.getContextPath());	

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String firstname = request.getParameter("userfirstname");
		String lastname = request.getParameter("userlastname");
		String email = request.getParameter("useremail");
		String phonenumber = request.getParameter("userphone");
		String gender = request.getParameter("usergender");
		String password = request.getParameter("userpassword");
		
		UserModel user = new UserModel(firstname, lastname, email, phonenumber, gender, password);
		UserOperation.AddNewUser(user);

		RequestDispatcher res = request.getRequestDispatcher("index.jsp");
		res.forward(request, response);
		
		
		
	}
	
	
	

}