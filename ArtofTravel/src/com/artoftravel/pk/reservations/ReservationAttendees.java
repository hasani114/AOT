package com.artoftravel.pk.reservations;

public class ReservationAttendees {
	
	private int reservationId;
	private int attendeeID;
	private String attendeeName;
	private String attendeeAge;
	private String attendeeGender;
	

	public ReservationAttendees() {
		super();
	}

	public ReservationAttendees(int reservationId, int attendeeID, String attendeeName, String attendeeAge,
			String attendeeGender) {
		super();
		this.reservationId = reservationId;
		this.attendeeID = attendeeID;
		this.attendeeName = attendeeName;
		this.attendeeAge = attendeeAge;
		this.attendeeGender = attendeeGender;
	}


	public int getReservationId() {
		return reservationId;
	}


	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
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
