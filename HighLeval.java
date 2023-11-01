package com.xworkz.shopping.things;

public class HighLeval extends Programminglanguage {

	public HighLeval() {
		super("java","python","c",4.5f);
		System.out.println("This is an derived class constructor");
		System.out.println(super.getNameOfPL1());
		System.out.println(super.getNameOfPL2());
		System.out.println(super.getNameOfPL3());
		System.out.println(super.getRatings());
	}
	

}
