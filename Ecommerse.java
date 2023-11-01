package com.xworkz.shopping.things;

public class Ecommerse extends Products{

	public Ecommerse() {
		super(1, "Smartphone", 499.99, "High-quality smartphone with advanced features.");
		System.out.println("This is derived class constructor");
		System.out.println(super.getId());
		System.out.println(super.getName());
		System.out.println(super.getPrice());
		System.out.println(super.getDescription());
	}


}
