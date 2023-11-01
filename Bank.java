package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
	private String accountName;
	private String acountHolder;
	private String accountNumber;
	private int totalAmmount;
	public Bank() {
		System.out.println("No-args constructor");
	}
	public Bank(String accountName, String acountHolder, String accountNumber, int totalAmmount) {
		this.accountName = accountName;
		this.acountHolder = acountHolder;
		this.accountNumber = accountNumber;
		this.totalAmmount = totalAmmount;
		System.out.println("all args constructor");
	}
	
	
}
