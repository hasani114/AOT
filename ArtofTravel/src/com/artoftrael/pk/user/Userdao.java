package com.artoftrael.pk.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;




public class Userdao {

	
	public static void AddNewUser(UserModel user) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO users (user_first_name, user_last_name, user_email, user_phone, user_gender, user_password, user_role) VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, user.getUserFirstName());
			stmt.setString(2, user.getUserLastName());
			stmt.setString(3, user.getUserEmail());
			stmt.setString(4, user.getUserPhone());
			stmt.setString(5, user.getUserGender());
			stmt.setString(6, user.getUserPassword());
			stmt.setString(7, "User");

			
		

			

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
	
	public static boolean AuthenticateUser(String username, String password) {
		
			
		boolean valid = false;
		
		
		// Connect to database
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
					"2001Space");
			
		// select username column
			
			String query = "select user_email, user_password FROM users where user_email = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, username);

			ResultSet rs = stmt.executeQuery();

		// read through result to see if it equals username
			if (rs.next()) {
					String dbpassword = rs.getString("user_password");
					
					if (dbpassword.contentEquals(password)) {
						
						valid = true;
						
					} else valid = false;
					
			}

			stmt.close();
			rs.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	
		return valid;
	}
	
	public static UserModel getUserInfo(String username) {
		
		UserModel user = new UserModel();
		
		// Connect to database
		
				try {

					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ArtofTravel", "root",
							"2001Space");
					
					// select 
					
					String query = "select * FROM users where user_email = ?";
					PreparedStatement stmt = con.prepareStatement(query);
					stmt.setString(1, username);

					ResultSet rs = stmt.executeQuery();
					
					
					while (rs.next()) {
					int userID = rs.getInt("ID");
					String firstname = rs.getString("user_first_name");
					String lastname = rs.getString("user_last_name");
					String email = rs.getString("user_email");
					String phone = rs.getString("user_phone");
					String gender = rs.getString("user_gender");
					String password = rs.getString("user_password");
					String userrole = rs.getString("user_role");

					
					UserModel userinfo = new UserModel(userID, firstname, lastname, email, phone, gender, password, userrole);
					
					user = userinfo;

					}
					
					stmt.close();
					rs.close();
					con.close();

				} catch (Exception e) {
					e.printStackTrace();

				}

				return user;

	}
				
	}
	
	
