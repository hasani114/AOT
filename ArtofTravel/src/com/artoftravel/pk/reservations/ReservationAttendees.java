package com.artoftravel.pk.reservations;

public class ReservationAttendees {
	
	private int attendeeID;
	private String attendeeName;
	private String attendeeAge;
	private String attendeeGender;
	
	
	public ReservationAttendees(int attendeeID, String attendeeName, String attendeeAge, String attendeeGender) {
		super();
		this.attendeeID = attendeeID;
		this.attendeeName = attendeeName;
		this.attendeeAge = attendeeAge;
		this.attendeeGender = attendeeGender;
	}


	public ReservationAttendees() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAttendeeID() {
		return attendeeID;
	}


	public void setAttendeeID(int attendeeID) {
		this.attendeeID = attendeeID;
	}


	public String getAttendeeName() {
		return attendeeName;
	}


	public void setAttendeeName(String attendeeName) {
		this.attendeeName = attendeeName;
	}


	public String getAttendeeAge() {
		return attendeeAge;
	}


	public void setAttendeeAge(String attendeeAge) {
		this.attendeeAge = attendeeAge;
	}


	public String getAttendeeGender() {
		return attendeeGender;
	}


	public void setAttendeeGender(String attendeeGender) {
		this.attendeeGender = attendeeGender;
	}
	
	
	
	
	
	
	

}
