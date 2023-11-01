package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
	private int id;
    private String name;
    private double price;
    private String description;
    
	public Products() {
	System.out.println("No args constructor");	
	}
	public Products(int id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		System.out.println("All args constructor");
	}
    

}
