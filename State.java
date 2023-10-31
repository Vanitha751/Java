package com.xworkz.september.things;

public class State {
	private String nameOfCity;
	private boolean hillStations;
	private String visitingPlaces;
	
	public State() {
		System.out.println("No arguement constructor");
	}

	public State(String nameOfCity, boolean hillStations, String visitingPlaces) {
		this.nameOfCity = nameOfCity;
		this.hillStations = hillStations;
		this.visitingPlaces = visitingPlaces;
		System.out.println("parameterized constructor");
	}

	public String getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(String nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	public boolean isHillStations() {
		return hillStations;
	}

	public void setHillStations(boolean hillStations) {
		this.hillStations = hillStations;
	}

	public String getVisitingPlaces() {
		return visitingPlaces;
	}

	public void setVisitingPlaces(String visitingPlaces) {
		this.visitingPlaces = visitingPlaces;
	}
	

}
