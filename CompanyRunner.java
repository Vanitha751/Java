package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Employee;

public class CompanyRunner {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setCompanyName("Accenture");
		e.setLocation("chennai");
		e.setRatings(4.0f);
		e.setGrade('A');
		String CompanyName =e.getCompanyName();
		System.out.println(CompanyName);
		String Location=e.getLocation();
		System.out.println(Location);
		float ratings=e.getRatings();
		System.out.println(ratings);
	    char c=e.getGrade();
	    System.out.println(c);
	}

}
