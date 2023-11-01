package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Company {
private String companyName;
private String location;
private float ratings;
private char grade;
public Company() {
	System.out.println("No args constructor");
}
public Company(String companyName, String location, float ratings, char grade) {
	super();
	this.companyName = companyName;
	this.location = location;
	this.ratings = ratings;
	this.grade = grade;
	System.out.println("All args constructor");
}
}