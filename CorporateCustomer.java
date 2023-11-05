package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CorporateCustomer extends Customer{
	private String companyName;
    private String contactPerson;
    
	public CorporateCustomer() {
		super("vanitha","pachappagarivanitha@gmai.com");
	System.out.println("This is the derived class constructor");
	System.out.println(super.getName());
	System.out.println(super.getEmail());
	}


	
}
