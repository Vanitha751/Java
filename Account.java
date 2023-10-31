package com.xworkz.september.things;

public class Account {
	private String accountName;
	private String accountHolder;
	private int balance;
	private FD fd;
	private RD rd;
	public Account() {
		System.out.println("No arguement Constructor");
	}
	public Account(String accountName, String accountHolder, short balance, FD fd, RD rd) {
		this.accountName = accountName;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.fd = fd;
		this.rd = rd;
	}

 
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public void setBalance(int balance) {
	this.balance = balance;
}


public String getAccountName() {
	return accountName;
}
public String getAccountHolder() {
	return accountHolder;
}

public int getBalance() {
	return balance;
}
public FD getFd() {
	return fd;
}
public void setFd(FD fd) {
	this.fd = fd;
}
public RD getRd() {
	return rd;
}
public void setRd(RD rd) {
	this.rd = rd;
}
}
