package com.artoftrael.pk.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
	
}
