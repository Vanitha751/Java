package com.xworkz.september.things;

public class Bank {
	private String bankName;
	private String location;
	private int noOfBranches;
	private Payment payment;
	private Account account;
	public Bank() {
		System.out.println("No-arguement constructor");
	}

	public Bank(String bankName, String location, int noOfBranches, Payment payment, Account account) {
		this.bankName = bankName;
		this.location = location;
		this.noOfBranches = noOfBranches;
		this.setPayment(payment);
		this.setAccount(account);
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	
	public String getBankName() {
		return bankName;
	}
	public String getLocation() {
		return location;
	}
	
	public int getNoOfBranches() {
		return noOfBranches;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}
