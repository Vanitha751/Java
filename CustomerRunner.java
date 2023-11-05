package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.CorporateCustomer;

public class CustomerRunner {
public static void main(String[] args) {
	CorporateCustomer c=new CorporateCustomer();
	c.setCompanyName("Flipkart");
	c.setContactPerson("987465321");
	System.out.println(c.getCompanyName());
	System.out.println(c.getContactPerson());
	c.setEmail("shivani@gmail.com");
	c.setName("bujji");
	String n=c.getName();
	System.out.println(n);
	String e=c.getEmail();
	System.out.println(e);

}
}
