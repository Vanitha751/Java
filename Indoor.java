package com.xworkz.shopping.things;

public class Indoor extends Sports {

	public Indoor() {
		super("Football", 11, "Ball", "Grass field");
		System.out.println("This is derived class constructor");
		System.out.println(super.getName());
		System.out.println(super.getNumberOfPlayers());
		System.out.println(super.getEquipment());
		System.out.println(super.getPlayingSurface());
	}

	


}
