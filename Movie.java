package com.xworkz.shopping.things;

public class Movie extends Director {

	public Movie() {
		super("Christopher", 51, "British-American", "Academy Awards");
		System.out.println("This is the derived constructor");
		System.out.println(super.getName());
		System.out.println(super.getAge());
		System.out.println(super.getNationality());
		System.out.println(super.getAwards());
	}
	

}
