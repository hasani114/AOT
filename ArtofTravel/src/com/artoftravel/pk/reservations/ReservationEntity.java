package com.artoftravel.pk.reservations;

public class ReservationEntity {
	
	private int reservationID;
	private int tourID;
	private int userID;
	private String reservationstatus;
	private int reservationpaymentstatus;
	private int numberofattendees;
	
	
	public ReservationEntity(int reservationID, int tourID, int userID, String reservationstatus,
			int reservationpaymentstatus, int numberofattendees) {
		super();
		this.reservationID = reservationID;
		this.tourID = tourID;
		this.userID = userID;
		this.reservationstatus = reservationstatus;
		this.reservationpaymentstatus = reservationpaymentstatus;
		this.numberofattendees = numberofattendees;
	}
	
	public ReservationEntity(int tourID, int userID, int numberofattendees) {
		super();
		this.tourID = tourID;
		this.userID = userID;
		this.reservationstatus = "tentative";
		this.reservationpaymentstatus = 0;
		this.numberofattendees = numberofattendees;
	}
	
	
	public int getReservationID() {
		return reservationID;
	}
	public void setReservationID(int reservationID) {
		this.reservationID = reservationID;
	}
	public int getTourID() {
		return tourID;
	}
	public void setTourID(int tourID) {
		this.tourID = tourID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getReservationstatus() {
		return reservationstatus;
	}
	public void setReservationstatus(String reservationstatus) {
		this.reservationstatus = reservationstatus;
	}
	public int getReservationpaymentstatus() {
		return reservationpaymentstatus;
	}
	public void setReservationpaymentstatus(int reservationpaymentstatus) {
		this.reservationpaymentstatus = reservationpaymentstatus;
	}
	public int getNumberofattendees() {
		return numberofattendees;
	}
	public void setNumberofattendees(int numberofattendees) {
		this.numberofattendees = numberofattendees;
	}
	
	
	
	
	

}
