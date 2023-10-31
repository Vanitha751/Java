package com.xworkz.september.things;

public class FD {
	private String depositeAmount;
    private int fixedAmmount;
    private boolean onlinepayment;
    public FD() {
System.out.println("No-Arguement constructor");
	}
    public FD(String depositeAmount, int fixedAmmount, boolean onlinepayment) {
System.out.println("Arguement constructor");
		this.depositeAmount = depositeAmount;
		this.fixedAmmount = fixedAmmount;
		this.onlinepayment = onlinepayment;
	}
	public void setDepositeAmount(String depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public void setFixedAmmount(int fixedAmmount) {
		this.fixedAmmount = fixedAmmount;
	}
	public void setOnlinepayment(boolean onlinepayment) {
		this.onlinepayment = onlinepayment;
	}
	public String getDepositeAmount() {
		return depositeAmount;
	}
	public int getFixedAmmount() {
		return fixedAmmount;
	}
	public boolean isOnlinepayment() {
		return onlinepayment;
	}


}
