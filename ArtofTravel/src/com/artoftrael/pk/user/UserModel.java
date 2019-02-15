package com.artoftrael.pk.user;

public class UserModel {

	private int UserId;
	private String UserEmail;
	private String UserFirstName;
	private String UserLastName;
	private String UserGender;
	private String UserPhone;
	private String UserPassword;
	
	
	
	
	public UserModel(int userId, String userEmail, String userFirstName, String userLastName, String userGender,
			String userPhone, String userPassword) {
		super();
		UserId = userId;
		UserEmail = userEmail;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		UserGender = userGender;
		UserPhone = userPhone;
		UserPassword = userPassword;
	}


	public UserModel(String userEmail, String userFirstName, String userLastName, String userGender, String userPhone,
			String userPassword) {
		super();
		UserEmail = userEmail;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		UserGender = userGender;
		UserPhone = userPhone;
		UserPassword = userPassword;
	}

	
	

	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	public String getUserEmail() {
		return UserEmail;
	}


	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}


	public String getUserFirstName() {
		return UserFirstName;
	}


	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}


	public String getUserLastName() {
		return UserLastName;
	}


	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}


	public String getUserGender() {
		return UserGender;
	}


	public void setUserGender(String userGender) {
		UserGender = userGender;
	}


	public String getUserPhone() {
		return UserPhone;
	}


	public void setUserPhone(String userPhone) {
		UserPhone = userPhone;
	}


	public String getUserPassword() {
		return UserPassword;
	}


	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
	
	
}
