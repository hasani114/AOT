package com.artoftrael.pk.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;




public class UserOperation {

	
	public static void AddNewUser(UserModel user) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO users (user_first_name, user_last_name, user_email, user_phone, user_gender, user_password) VALUES (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, user.getUserFirstName());
			stmt.setString(2, user.getUserLastName());
			stmt.setString(3, user.getUserEmail());
			stmt.setString(4, user.getUserPhone());
			stmt.setString(5, user.getUserGender());
			stmt.setString(6, user.getUserPassword());

			stmt.execute();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public ArrayList<UserModel> viewUsers() {

		ArrayList<UserModel> userlist = new ArrayList<UserModel>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");

			String query = "select * FROM users";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				userlist.add(new UserModel(rs.getInt("ID"), rs.getString("user_first_name"),
						rs.getString("user_last_name"), rs.getString("user_email"), rs.getString("user_phone"),
						rs.getString("user_gender"), rs.getString("user_password")));
			}

			stmt.close();
			rs.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return userlist;

	}
	
	public static ArrayList<UserModel> AuthenticateUser(String username, String password) {
		
		//create arraylist to hold data from result
		ArrayList<UserModel> testlist = new ArrayList<UserModel>();

		// Connect to database
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
		// select username column
			
			String query = "select * FROM users where user_email = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, username);

			ResultSet rs = stmt.executeQuery();

		// read through result to see if it equals username
			while (rs.next()) {
				testlist.add(new UserModel(rs.getInt("ID"), rs.getString("user_first_name"),
						rs.getString("user_last_name"), rs.getString("user_email"), rs.getString("user_phone"),
						rs.getString("user_gender"), rs.getString("user_password")));
			}

			stmt.close();
			rs.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
		// if false return false
		// if true, write another query to get password of the username
		// if password is valid, return true
		
		return testlist;
		
		
//		
//		if (username.equals("hasan")) {
//			return true;
//		} else return false;	
		
	}
	
	
	
}
