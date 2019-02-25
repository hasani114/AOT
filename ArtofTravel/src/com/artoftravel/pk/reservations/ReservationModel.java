package com.artoftravel.pk.reservations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;


public class ReservationModel {
	
	
	public void createReservation(ReservationEntity reservation) {
		
		int tourID = reservation.getTourID();
		int userID = reservation.getUserID();
		int numberofattendees = reservation.getNumberofattendees();
		String reservationstatus = reservation.getReservationstatus();
		int paymentstatus = reservation.getReservationpaymentstatus();
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
			String query = "insert into reservations (tour_ID, user_ID, reservation_Status, reservation_payment_status, number_of_attendees, reservation_create_date) values (?, ? ,?, ? , ? , CURRENT_DATE)";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, tourID);
			stmt.setInt(2, userID);
			stmt.setString(3, reservationstatus);
			stmt.setInt(4, paymentstatus);
			stmt.setInt(5, numberofattendees);

			
			stmt.execute();
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		} 
		
		}
	
	
	public ArrayList<ReservationEntity> getAllReservations() {
		
		ArrayList<ReservationEntity> reservations = new ArrayList<ReservationEntity>();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
		
		String query = "Select * from reservations;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			
			reservations.add(new ReservationEntity(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
			
		}
		
		stmt.close();
		rs.close();
		con.close();

	} catch (Exception e) {
		e.printStackTrace();

	}
		
		
		
		return reservations;
		
	}
 		
		
	}
	
	
	


