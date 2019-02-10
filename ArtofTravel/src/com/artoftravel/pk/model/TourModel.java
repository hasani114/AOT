package com.artoftravel.pk.model;

import java.util.Date;

public class TourModel {
	
	private String tourname;
	private String tourlocation;
	private String country;
	private String groupsize;
	private String tourprice;
	private String tourduration;
	private String tourdescription;

	
	
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



	
	
	
	

}
