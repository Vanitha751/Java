package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Cloths;

public class ClothsRunner {
public static void main(String[] args) {
	Cloths cloth=new Cloths();
	cloth.setNameOfTheCloth("Dress");
	cloth.setPrice(10);
	cloth.setLength(12);
	cloth.setSize('S');
	cloth.getNameOfTheCloth();
	cloth.getPrice();
	cloth.getSize();
	cloth.getLength();
	System.out.println(cloth.getNameOfTheCloth());
	System.out.println(cloth.getLength());
	System.out.println(cloth.getSize());
	System.out.println(cloth.getPrice());
	
}
}
