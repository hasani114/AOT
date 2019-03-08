package com.artoftravel.pk.tour;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.artoftravel.pk.reservations.ReservationModel;
import com.artoftravel.pk.reservations.Reservationdao;

public class TourModel {
	
	private int tourID;
	private String tourName;
	private String tourLocation;
	private String country;
	private String groupSize;
	private String tourPrice;
	private String tourDuration;
	private String tourDescription;
	private int availableSeats;
	private Date tourDate;
	private String tourBanner;
	private ArrayList<ReservationModel> reservations;
	
	// Need to Implement
	private List<String> tourActivities;
	private Date tourEndDate;
	
	
	
	


	
	
	
	public TourModel() {
		super();
		
	}


	public TourModel(String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription) {
		super();
		this.tourName = tourname;
		this.tourLocation = tourlocation;
		this.country = country;
		this.groupSize = groupsize;
		this.tourPrice = tourprice;
		this.tourDuration = tourduration;
		this.tourDescription = tourdescription;
	
	}
	
	public TourModel(String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription, String tourbanner, Date tourdate) {
		super();
		this.tourName = tourname;
		this.tourLocation = tourlocation;
		this.country = country;
		this.groupSize = groupsize;
		this.tourPrice = tourprice;
		this.tourDuration = tourduration;
		this.tourDescription = tourdescription;
		this.tourBanner = tourbanner;
		this.tourDate = tourdate;
	
	}
	
	public TourModel(int tourID, String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription, String tourbanner, Date tourdate) {
		super();
		this.tourID = tourID;
		this.tourName = tourname;
		this.tourLocation = tourlocation;
		this.country = country;
		this.groupSize = groupsize;
		this.tourPrice = tourprice;
		this.tourDuration = tourduration;
		this.tourDescription = tourdescription;
		this.tourBanner = tourbanner;
		this.tourDate = tourdate;
	
	}
	
	public TourModel(int tourID, String tourname, String tourlocation, String country, String groupsize, String tourprice,
			String tourduration, String tourdescription) {
		super();
		this.tourID = tourID;
		this.tourName = tourname;
		this.tourLocation = tourlocation;
		this.country = country;
		this.groupSize = groupsize;
		this.tourPrice = tourprice;
		this.tourDuration = tourduration;
		this.tourDescription = tourdescription;
	
	}
	
	
	
	public TourModel(int tourID, String tourName, String tourLocation, String country, String groupSize,
			String tourPrice, String tourDuration, String tourDescription, int availableSeats, Date tourDate,
			String tourBanner, List<String> tourActivities, ArrayList<ReservationModel> reservations) {
		super();
		this.tourID = tourID;
		this.tourName = tourName;
		this.tourLocation = tourLocation;
		this.country = country;
		this.groupSize = groupSize;
		this.tourPrice = tourPrice;
		this.tourDuration = tourDuration;
		this.tourDescription = tourDescription;
		this.availableSeats = availableSeats;
		this.tourDate = tourDate;
		this.tourBanner = tourBanner;
		this.tourActivities = tourActivities;
		this.reservations = reservations;
	}


	public int getTourID() {
		return tourID;
	}

	public void setTourID(int tourID) {
		this.tourID = tourID;
	}

	public String getTourduration() {
		return tourDuration;
	}

	public void setTourduration(String tourduration) {
		this.tourDuration = tourduration;
	}




	public String getTourname() {
		return tourName;
	}


	public void setTourname(String tourname) {
		this.tourName = tourname;
	}


	public String getTourlocation() {
		return tourLocation;
	}


	public void setTourlocation(String tourlocation) {
		this.tourLocation = tourlocation;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getGroupsize() {
		return groupSize;
	}


	public void setGroupsize(String groupsize) {
		this.groupSize = groupsize;
	}


	public String getTourprice() {
		return tourPrice;
	}


	public void setTourprice(String tourprice) {
		this.tourPrice = tourprice;
	}


	public String getTourDuration() {
		return tourDuration;
	}


	public void setTourDuration(String tourdays) {
		this.tourDuration = tourdays;
	}


	public String getTourdescription() {
		return tourDescription;
	}


	public void setTourdescription(String tourdescription) {
		this.tourDescription = tourdescription;
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
	
	public List<String> getTourActivities() {
		return tourActivities;
	}


	public void setTourActivities(List<String> tourActivities) {
		this.tourActivities = tourActivities;
	}


	public Date getTourEndDate() {
		return tourEndDate;
	}


	public void setTourEndDate(Date tourEndDate) {
		this.tourEndDate = tourEndDate;
	}
	
	


}
