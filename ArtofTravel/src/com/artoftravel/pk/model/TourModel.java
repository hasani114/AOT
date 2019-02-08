package com.artoftravel.pk.model;

import java.util.Date;

public class TourModel {
	
	private String tourname;
	private String tourlocation;
	private String country;
	private int groupsize;
	private double tourprice;
	private int tourdays;
	private String tourdescription;
	private Date startdate;
	private Date enddate;
	
	
	public TourModel(String tourname, String tourlocation, String country, int groupsize, double tourprice,
			int tourdays, String tourdescription, Date startdate, Date enddate) {
		super();
		this.tourname = tourname;
		this.tourlocation = tourlocation;
		this.country = country;
		this.groupsize = groupsize;
		this.tourprice = tourprice;
		this.tourdays = tourdays;
		this.tourdescription = tourdescription;
		this.startdate = startdate;
		this.enddate = enddate;
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


	public int getGroupsize() {
		return groupsize;
	}


	public void setGroupsize(int groupsize) {
		this.groupsize = groupsize;
	}


	public double getTourprice() {
		return tourprice;
	}


	public void setTourprice(double tourprice) {
		this.tourprice = tourprice;
	}


	public int getTourdays() {
		return tourdays;
	}


	public void setTourdays(int tourdays) {
		this.tourdays = tourdays;
	}


	public String getTourdescription() {
		return tourdescription;
	}


	public void setTourdescription(String tourdescription) {
		this.tourdescription = tourdescription;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	
	
	
	

}
