package com.xworkz.shopping.things;

public class Employee extends Company {

	public Employee() {
		super("IBM","Bangloor",4.0f,'A');
		System.out.println("This is derived class constructor");
	    System.out.println(super.getCompanyName());
	    System.out.println(super.getLocation());
	    System.out.println(super.getRatings());
	    System.out.println(super.getGrade());
	}


}
