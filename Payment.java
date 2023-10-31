package com.xworkz.september.things;

public class Payment {
	private String personName;
	private boolean online;
	private int totalAmmount;
	private Online online1;
	public Payment() {
	System.out.println("No-arguement constructor");
	}
	public Payment(String personName, boolean online, int totalAmmount, Online online1) {
		super();
		this.personName = personName;
		this.online = online;
		this.totalAmmount = totalAmmount;
		this.setOnline1(online1);
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public void setTotalAmmount(int totalAmmount) {
		this.totalAmmount = totalAmmount;
	}


	public boolean isOnline() {
		return online;
	}
	public String getPersonName() {
		return personName;
	}

	public int getTotalAmmount() {
		return totalAmmount;
	}
	public Online getOnline1() {
		return online1;
	}
	public void setOnline1(Online online1) {
		this.online1 = online1;
	}

	

}
