package com.xworkz.september.things;
public class Online {
	private String phonePay;
	private long transactionId;
	private String googlePay;
	public Online() {
		System.out.println("No-arguement constructor");
	}
	public Online(String phonePay,long transactionId,String googlePay) {
		this.phonePay=phonePay;
		this.transactionId=transactionId;
		this.googlePay=googlePay;
		System.out.println("Arguement constructor");
	}
	public void setPhonePay(String phonePay) {
		this.phonePay = phonePay;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public void setGooglePay(String googlePay) {
		this.googlePay = googlePay;
	}
	public String getPhonePay() {
		return phonePay;
	}
	public long getTransactionId() {
		return transactionId;
	}
	
	public String getGooglePay() {
		return googlePay;
	}
	
	

}
