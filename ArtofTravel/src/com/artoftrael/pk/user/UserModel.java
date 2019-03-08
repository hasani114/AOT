package com.artoftrael.pk.user;

public class UserModel {

	private int UserId;
	private String UserFirstName;
	private String UserLastName;
	private String UserEmail;
	private String UserPhone;
	private String UserGender;
	private String UserPassword;
	private String UserRole;
	
	
	
	
	public UserModel(int userId, String userFirstName, String userLastName, String userEmail, 
			String userPhone,  String userGender, String userPassword, String userrole) {
		super();
		UserId = userId;
		UserEmail = userEmail;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		UserGender = userGender;
		UserPhone = userPhone;
		UserPassword = userPassword;
		UserRole = userrole;
	}


	public UserModel(String userFirstName, String userLastName, String userEmail,  String userPhone,String userGender,
			String userPassword) {
		super();
		UserEmail = userEmail;
		UserFirstName = userFirstName;
		UserLastName = userLastName;
		UserGender = userGender;
		UserPhone = userPhone;
		UserPassword = userPassword;
		UserRole = this.UserRole;
	}
	
	public UserModel() {
		super();
		UserId = this.UserId;
		UserEmail = this.UserEmail;
		UserFirstName = this.UserFirstName;
		UserLastName = this.UserLastName;
		UserGender = this.UserGender;
		UserPhone = this.UserPhone;
		UserPassword = this.UserPassword;
		UserRole = this.UserRole;
	}

	
	

	public String getUserRole() {
		return UserRole;
	}


	public void setUserRole(String userRole) {
		UserRole = userRole;
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
