package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
//@All Args constructor
//@NoArgs constructor
public class Animal {
	private String nameOfTheAnimal;
	private int age;
	private String location;
	private String gender;
	public Animal() {
	System.out.println("No-Aegs Constructor");
	}
	public Animal(String nameOfTheAnimal, int age,String location,String gender) {
		this.nameOfTheAnimal = nameOfTheAnimal;
		this.age = age;
		this.location=location;
		this.gender=gender;
		System.out.println("All args constructor");
	}
	
}
