package com.xworkz.shopping.things;

public class Person extends Dancer{

	public Person() {
		super("folk","vanitha","ottuMidaKudu",50);
		System.out.println("This is the derived class constructor");
		System.out.println(super.getStudentName());
		System.out.println(super.getDanceName());
		System.out.println(super.getSongName());
		System.out.println(super.getMarks());
	}

}
