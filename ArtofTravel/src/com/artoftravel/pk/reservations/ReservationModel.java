package com.artoftravel.pk.reservations;

import java.util.ArrayList;
import java.util.Date;

public class ReservationModel {
	
	private int reservationID;
	private int tourID;
	private int userID;
	private String reservationstatus;
	private int reservationpaymentstatus;
	private int numberofattendees;
	private Date reservationcreationdate;
	private ArrayList<ReservationAttendees> attendees;
	
	
	public ArrayList<ReservationAttendees> getAttendees() {
		return attendees;
	}

	public void setAttendees(ArrayList<ReservationAttendees> attendees) {
		this.attendees = attendees;
	}

	public Date getReservationcreationdate() {
		return reservationcreationdate;
	}

	public void setReservationcreationdate(Date reservationcreationdate) {
		this.reservationcreationdate = reservationcreationdate;
	}

	public ReservationModel(int reservationID, int tourID, int userID, String reservationstatus,
			int reservationpaymentstatus, int numberofattendees, Date reservationcreationdate) {
		super();
		this.reservationID = reservationID;
		this.tourID = tourID;
		this.userID = userID;
		this.reservationstatus = reservationstatus;
		this.reservationpaymentstatus = reservationpaymentstatus;
		this.numberofattendees = numberofattendees;
		this.reservationcreationdate = reservationcreationdate;
	}
	
	public ReservationModel(int tourID, int userID, int numberofattendees) {
		super();
		this.tourID = tourID;
		this.userID = userID;
		this.reservationstatus = "tentative";
		this.reservationpaymentstatus = 0;
		this.numberofattendees = numberofattendees;
		this.reservationcreationdate = null;

	}
	
	public ReservationModel() {
		super();
		this.tourID = tourID;
		this.userID = userID;
		this.reservationstatus = "tentative";
		this.reservationpaymentstatus = 0;
		this.numberofattendees = numberofattendees;
		this.reservationcreationdate = null;

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
