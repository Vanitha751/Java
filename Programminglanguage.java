package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Programminglanguage {
	private String nameOfPL1;
	private String nameOfPL2;
	private String nameOfPL3;
	private float ratings;
	public Programminglanguage() {
	System.out.println("Noargs constructor");
	}
	public Programminglanguage(String nameOfPL1, String nameOfPL2, String nameOfPL3,float ratings) {
		this.nameOfPL1 = nameOfPL1;
		this.nameOfPL2 = nameOfPL2;
		this.nameOfPL3 = nameOfPL3;
		this.ratings=ratings;
		System.out.println("All args constructor");
	}
	

}
