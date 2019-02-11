package com.artoftravel.pk.model;

import java.sql.*;

public class DatabaseHelper {

	
	public void addNewTour(TourModel tour) {

		String tourname = tour.getTourname();
		String tourlocation = tour.getTourlocation();
		String tourcountry = tour.getCountry();
		String groupsize = tour.getGroupsize();
		String tourduration = tour.getTourDuration();
		String tourprice = tour.getTourprice();
		String tourdescription = tour.getTourdescription();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO tour_details (tour_name, tour_location, tour_country, group_size, tour_price, tour_duration, tour_description) VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, tourname);
			stmt.setString(2, tourlocation);
			stmt.setString(3, tourcountry);
			stmt.setString(4, groupsize);
			stmt.setString(5, tourprice);
			stmt.setString(6, tourduration);
			stmt.setString(7, tourdescription);

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
}
