package com.artoftravel.pk.tour;

import java.util.ArrayList;
import java.util.Date;
import com.artoftravel.pk.reservations.ReservationModel;
import com.artoftravel.pk.reservations.Reservationdao;




public class TourModel {
	
	private int tourID;
	private String tourname;
	private String tourlocation;
	private String country;
	private String groupsize;
	private String tourprice;
	private String tourduration;
	private String tourdescription;
	private int availableSeats;
	private Date tourDate;
	private String tourBanner;
	private ArrayList<ReservationModel> reservations;
	
	
	public TourModel() {
		super();
		
	}


	public TourModel(String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription) {
		super();
		this.tourname = tourname;
		this.tourlocation = tourlocation;
		this.country = country;
		this.groupsize = groupsize;
		this.tourprice = tourprice;
		this.tourduration = tourduration;
		this.tourdescription = tourdescription;
	
	}
	
	public TourModel(String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription, String tourbanner, Date tourdate) {
		super();
		this.tourname = tourname;
		this.tourlocation = tourlocation;
		this.country = country;
		this.groupsize = groupsize;
		this.tourprice = tourprice;
		this.tourduration = tourduration;
		this.tourdescription = tourdescription;
		this.tourBanner = tourbanner;
		this.tourDate = tourdate;
	
	}
	
	public TourModel(int tourID, String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription, String tourbanner, Date tourdate) {
		super();
		this.tourID = tourID;
		this.tourname = tourname;
		this.tourlocation = tourlocation;
		this.country = country;
		this.groupsize = groupsize;
		this.tourprice = tourprice;
		this.tourduration = tourduration;
		this.tourdescription = tourdescription;
		this.tourBanner = tourbanner;
		this.tourDate = tourdate;
	
	}
	
	public TourModel(int tourID, String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription) {
		super();
		this.tourID = tourID;
		this.tourname = tourname;
		this.tourlocation = tourlocation;
		this.country = country;
		this.groupsize = groupsize;
		this.tourprice = tourprice;
		this.tourduration = tourduration;
		this.tourdescription = tourdescription;
	
	}
	
	public int getTourID() {
		return tourID;
	}

	public void setTourID(int tourID) {
		this.tourID = tourID;
	}

	public String getTourduration() {
		return tourduration;
	}

	public void setTourduration(String tourduration) {
		this.tourduration = tourduration;
	}




	public String getTourname() {
		return tourname;
	}


	public void setTourname(String tourname) {
		this.tourname = tourname;
	}


	public String getTourlocation() {
		return tourlocation;
	}


	public void setTourlocation(String tourlocation) {
		this.tourlocation = tourlocation;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getGroupsize() {
		return groupsize;
	}


	public void setGroupsize(String groupsize) {
		this.groupsize = groupsize;
	}


	public String getTourprice() {
		return tourprice;
	}


	public void setTourprice(String tourprice) {
		this.tourprice = tourprice;
	}


	public String getTourDuration() {
		return tourduration;
	}


	public void setTourDuration(String tourdays) {
		this.tourduration = tourdays;
	}


	public String getTourdescription() {
		return tourdescription;
	}


	public void setTourdescription(String tourdescription) {
		this.tourdescription = tourdescription;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}


	public Date getTourDate() {
		
		return tourDate;
	}

	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}
	
	public String getTourBanner() {
		return tourBanner;
	}

	public void setTourBanner(String tourBanner) {
		this.tourBanner = tourBanner;
	}
	

	public ArrayList<ReservationModel> getReservations() {
		
		Reservationdao res = new Reservationdao();
		ArrayList<ReservationModel> reservations = res.getReservationByTourID(this.tourID);
		return reservations;
	}

	public void setReservations(ArrayList<ReservationModel> reservations) {
		this.reservations = reservations;
	}


}
