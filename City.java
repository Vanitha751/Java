package com.xworkz.september.things;

public class City {
	private String nameOfTheCity;
	private int noOfHotels;
	private int noOfSchools;
	private String visitingPlaces;
	private int noOfPgs;
	public City() {
		System.out.println("No-arguement constructor");
	}
	public City(String nameOfTheCity, int noOfHotels, int noOfSchools, String visitingPlaces, int noOfPgs) {
		this.nameOfTheCity = nameOfTheCity;
		this.noOfHotels = noOfHotels;
		this.noOfSchools = noOfSchools;
		this.visitingPlaces = visitingPlaces;
		this.noOfPgs = noOfPgs;
		System.out.println("parameterized constructor");
	}
	public void setNameOfTheCity(String nameOfTheCity) {
		this.nameOfTheCity = nameOfTheCity;
	}
	public void setNoOfHotels(int noOfHotels) {
		this.noOfHotels = noOfHotels;
	}
	public void setNoOfSchools(int noOfSchools) {
		this.noOfSchools = noOfSchools;
	}
	public void setVisitingPlaces(String visitingPlaces) {
		this.visitingPlaces = visitingPlaces;
	}
	public void setNoOfPgs(int noOfPgs) {
		this.noOfPgs = noOfPgs;
	}
	public String getNameOfTheCity() {
		return nameOfTheCity;
	}
	public int getNoOfHotels() {
		return noOfHotels;
	}
		public int getNoOfSchools() {
		return noOfSchools;
	}

	public String getVisitingPlaces() {
		return visitingPlaces;
	}
	public int getNoOfPgs() {
		return noOfPgs;
	}

}
