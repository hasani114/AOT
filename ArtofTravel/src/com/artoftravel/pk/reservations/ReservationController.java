package com.artoftravel.pk.reservations;
import com.artoftravel.pk.model.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReservationController")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
    public ReservationController() {
        super();
    }
    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		//Get reservation details from the reservation form
		int tourID = Integer.parseInt(request.getParameter("tourid"));
		int userID = Integer.parseInt(request.getParameter("userid"));
		int numberofattendees = Integer.parseInt(request.getParameter("numberofattendees"));
		
		System.out.println(tourID);
		System.out.println(userID);

		
		//Create Reservation Object using submitted data
		ReservationEntity reservation = new ReservationEntity(tourID, userID, numberofattendees);
		
		//Create Tour Object --- check to see if number of attendees is not greater than available seats.
		TourModel tour = new TourModel();
		tour.getAvailableSeats();
		
		
		//Call Create Reservation Method
		ReservationModel reserve = new ReservationModel();
		reserve.createReservation(reservation);
		
		
		
		
		
		
		
		
		
		
	}

}
