package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Accounts;

public class BankRunner {
public static void main(String[] args) {
	Accounts a=new Accounts();
	a.setAccountName("SBI");
	a.setAccountNumber("svsvsv143143");
	a.setAcountHolder("shivani");
	a.setTotalAmmount(20000);
	String n=a.getAccountName();
	System.out.println(n);
	String s=a.getAcountHolder();
	System.out.println(s);
	String v=a.getAccountNumber();
	System.out.println(v);
	int c=a.getTotalAmmount();
	System.out.println(c);
}
}
