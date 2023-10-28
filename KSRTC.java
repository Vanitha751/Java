package com.xworkz.september.things;

public class KSRTC {
	private String busName;
	private String busNumber;
	private int noOfSeats;
    private String to;
    private String from;
    
	public void getBusName(String busName) {
		this.busName = busName;
	}
	public void getBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public void getNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public void getTo(String to) {
		this.to = to;
	}
	public void getFrom(String from) {
		this.from = from;
	}	
	public String getFrom() {
		return from;
	}
	public String getBusName() {
		return busName;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public String getTo() {
		return to;
	}
}
