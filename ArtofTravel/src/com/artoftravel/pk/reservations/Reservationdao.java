package com.artoftravel.pk.reservations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;


public class Reservationdao {
	
	
	public void createReservation(ReservationModel reservation) {
		
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
			
			
		} catch (Exception e) {
			e.printStackTrace();

		} 
		
		}
	
	
	public ArrayList<ReservationModel> getAllReservations() {
		
		ArrayList<ReservationModel> reservations = new ArrayList<ReservationModel>();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
		
		String query = "Select * from reservations;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while (rs.next()) {
			
			reservations.add(new ReservationModel(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7)));
			
		}
		
		stmt.close();
		rs.close();
		con.close();

	} catch (Exception e) {
		e.printStackTrace();

	}
		
		
		
		return reservations;
		
	}
 		
	
	
	public ReservationModel getReservationByID(int reservationID) {
		
		ReservationModel reservation = new ReservationModel();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
			String query = "select * from reservations where ID = ?;";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, reservationID);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				reservation.setReservationID(rs.getInt("ID"));
				reservation.setTourID(rs.getInt("tour_ID"));
				reservation.setUserID(rs.getInt("user_ID"));
				reservation.setReservationstatus(rs.getString("reservation_Status"));
				reservation.setReservationpaymentstatus(rs.getInt("reservation_payment_status"));
				reservation.setNumberofattendees(rs.getInt("number_of_attendees"));
				reservation.setReservationcreationdate(rs.getDate("reservation_create_date"));
			} 
				stmt.close();
				rs.close();
				con.close();
		}	
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
		return reservation;
		
	}
	
	public void updateReservation(int reservationID, String reservationstatus, int reservationpaymentstatus, int numberofattendees) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
			String query = "Update reservations SET reservation_Status = ?, reservation_payment_status=?, number_of_attendees = ? where ID = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, reservationstatus);
			stmt.setInt(2, reservationpaymentstatus);
			stmt.setInt(3, numberofattendees);
			stmt.setInt(4, reservationID);
			
			stmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
public ArrayList<ReservationModel> getReservationByTourID(int tourID) {
		
		ArrayList<ReservationModel> reservations = new ArrayList<ReservationModel>();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
			String query = "select * from reservations where tour_ID = ?;";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, tourID);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				reservations.add(new ReservationModel(rs.getInt("ID"), rs.getInt("tour_ID"),rs.getInt("user_ID"),rs.getString("reservation_Status"),rs.getInt("reservation_payment_status"),rs.getInt("number_of_attendees"), rs.getDate("reservation_create_date")));
			
			} 
				stmt.close();
				rs.close();
				con.close();
		}	
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
		return reservations;
		
	}
	
	
}


