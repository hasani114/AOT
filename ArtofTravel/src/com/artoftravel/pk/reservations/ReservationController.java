package com.artoftravel.pk.reservations;
import com.artoftravel.pk.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ReservationController")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
    public ReservationController() {
        super();
    }
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all reservations from the db

	if (request.getQueryString().contentEquals("viewAll")) {
			
			ReservationModel reserve = new ReservationModel();
			
			ArrayList<ReservationEntity> reservations = reserve.getAllReservations();
			
			request.setAttribute("Reservations", reservations);
			
			RequestDispatcher rs = request.getRequestDispatcher("/Admin/reservations2.jsp");
			rs.forward(request, response);
		}
	
	
	//Edit Reservation ID Receive and Send Data to Edit Form
	
		
		  String edit = request.getParameter("editReservation"); 
		  
		  if (edit != null) {
			  
		  int reservationID = Integer.parseInt(request.getParameter("editReservation"));

		  
		  ReservationModel reserve = new ReservationModel(); 
		  ReservationEntity reservation = reserve.getReservationByID(reservationID);
		  request.setAttribute("Reservation", reservation);
		  
		  RequestDispatcher rs =
		  request.getRequestDispatcher("/Admin/editreservation.jsp"); rs.forward(request,
		  response);
 }
		  
		  
		  
		 
	
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String formname = request.getParameter("action");
		System.out.print(formname);
		
		if (formname.contentEquals("createreservation")) {
		
		//Get reservation details from the reservation form
		int tourID = Integer.parseInt(request.getParameter("tourid"));
		int userID = Integer.parseInt(request.getParameter("userid"));
		int numberofattendees = Integer.parseInt(request.getParameter("numberofattendees"));
		
		System.out.println(tourID);
		System.out.println(userID);

		
		//Create Reservation Object using submitted data
		ReservationEntity reservation = new ReservationEntity(tourID, userID, numberofattendees);
		
		//Create Tour Object --- check to see if number of attendees is not greater than available seats.
	
		
		
		//Call Create Reservation Method
		ReservationModel reserve = new ReservationModel();
		reserve.createReservation(reservation);
		
		// Redirect
		
		response.sendRedirect("ReservationController?viewAll");
		
		} else if (formname.contentEquals("search")) {
			
			//get search criterion - reservation ID
			
			
			//Call method in reservation model using reservation ID
			
			//Set Attribute in Request
			
			//Redirect to Reservations Page		
		}
		
		String update = request.getParameter("action");
		  
		  if (update.equals("updatereservation")) {
			  
			
			  int reservationID = Integer.parseInt(request.getParameter("reservationID"));
			  			 
			  String reservationstatus = request.getParameter("reservationstatus"); 
			  
			  int reservationpaymentstatus = Integer.parseInt(request.getParameter("reservationpaymentstatus")); 
			  
			  int numberofattendees = Integer.parseInt(request.getParameter("numberofattendees"));
			 
		  ReservationModel updates = new ReservationModel();
		  updates.updateReservation(reservationID, reservationstatus, reservationpaymentstatus, numberofattendees);
		  
		  response.sendRedirect("ReservationController?viewAll");

		  }
	}

}
