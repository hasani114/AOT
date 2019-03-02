package com.artoftravel.pk.tour;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;


public class Tourdao {

	
	public void addNewTour(TourModel tour) {

		String tourname = tour.getTourname();
		String tourlocation = tour.getTourlocation();
		String tourcountry = tour.getCountry();
		String groupsize = tour.getGroupsize();
		String tourduration = tour.getTourDuration();
		String tourprice = tour.getTourprice();
		String tourdescription = tour.getTourdescription();
		String tourbanner = tour.getTourBanner();
		Date tourdate = tour.getTourDate();



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO tour_details (tour_name, tour_location, tour_country, group_size, tour_price, tour_duration, tour_desc, tour_banner, tour_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, tourname);
			stmt.setString(2, tourlocation);
			stmt.setString(3, tourcountry);
			stmt.setString(4, groupsize);
			stmt.setString(5, tourprice);
			stmt.setString(6, tourduration);
			stmt.setString(7, tourdescription);
			stmt.setString(8, tourbanner);
			stmt.setDate(9, new java.sql.Date(tourdate.getTime()));


			stmt.execute();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public void deleteTour(String deletetour) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			// here sonoo is database name, root is username and password
			String query = "DELETE FROM tour_details WHERE ID=" + deletetour ;
			PreparedStatement stmt = con.prepareStatement(query);
		
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}
	
	public void updateTour() {
		
	}
	
	public ArrayList<TourModel> viewAllTours() {
		
		ArrayList<TourModel> tourlist = new ArrayList<TourModel>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			String query = "select * from tour_details";
			PreparedStatement stmt = con.prepareStatement(query);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				tourlist.add(new TourModel(rs.getInt("ID"), rs.getString("tour_name"), rs.getString("tour_location"), rs.getString("tour_country"), rs.getString("group_size"), rs.getString("tour_price"), rs.getString("tour_duration"), rs.getString("tour_desc"), rs.getString("tour_banner"), rs.getDate("tour_date")));
				
			}
			
			stmt.close();
			rs.close();
			con.close();
		
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
			
			return tourlist;
		
	}
	
	public ArrayList<TourModel> searchTours (String duration, String price, String tourlocation, String country) {
		
		ArrayList<TourModel> tourlist = new ArrayList<TourModel>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			String query = "select * from tour_details Where tour_duration <= ? AND tour_price <= ? AND tour_location LIKE CONCAT('%', ?, '%') AND tour_country LIKE CONCAT('%', ?, '%') ;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, duration);
			stmt.setString(2, price);
			stmt.setString(3, tourlocation);
			stmt.setString(4, country);

			
			ResultSet rs = stmt.executeQuery();
		
			while (rs.next()) {
				
				tourlist.add(new TourModel(rs.getInt("ID"), rs.getString("tour_name"), rs.getString("tour_location"), rs.getString("tour_country"), rs.getString("group_size"), rs.getString("tour_price"), rs.getString("tour_duration"), rs.getString("tour_description")));
				
			}
			
			stmt.close();
			rs.close();
			con.close();
		
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
		
		return tourlist;
	}
	
	public TourModel getTourByID(String tourID) {
		
		TourModel tour = new TourModel();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			String query = "select * from tour_details Where ID = ? ;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, tourID);
		
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) { 
				
				tour.setTourID(rs.getInt("ID"));
				tour.setTourname(rs.getString("tour_name"));
				tour.setTourlocation(rs.getString("tour_location"));
				tour.setCountry(rs.getString("tour_country"));
				tour.setGroupsize(rs.getString("group_size"));
				tour.setTourprice(rs.getString("tour_price"));
				tour.setTourduration(rs.getString("tour_duration"));
				tour.setTourdescription(rs.getString("tour_desc"));
				tour.setAvailableSeats(rs.getInt("available_seats"));
				tour.setTourBanner(rs.getString("tour_banner"));
				tour.setTourDate(rs.getDate("tour_date"));
				
			}
			
		}
		
			catch (Exception e) {
				e.printStackTrace();

			}
			
		return tour;
		
	}
	
	
	
	
}
	

