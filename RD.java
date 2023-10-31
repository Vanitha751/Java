package com.xworkz.september.things;

public class RD {
	private int depositeAmmount;
	private int totalAmmount;
	private boolean interest;
	public RD() {
	System.out.println("No arguement constructor");
	}
	public RD(short depositeAmmount, short totalAmmount, boolean interest) {
		this.depositeAmmount = depositeAmmount;
		this.totalAmmount = totalAmmount;
		this.interest = interest;
		System.out.println("arguement constructor");
	}
	public void setDepositeAmmount(int depositeAmmount) {
		this.depositeAmmount = depositeAmmount;
	}
	public void setTotalAmmount(int totalAmmount) {
		this.totalAmmount = totalAmmount;
	}
	public void setInterest(boolean interest) {
		this.interest = interest;
	}
	public int getTotalAmmount() {
		return totalAmmount;
	}
	public int getDepositeAmmount() {
		return depositeAmmount;
	}

	public boolean isInterest() {
		return interest;
	}
	
     
}
