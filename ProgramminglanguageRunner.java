package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.HighLeval;

public class ProgramminglanguageRunner {
	public static void main(String[] args) {
		HighLeval h=new HighLeval();
		h.setNameOfPL1("c++");
		h.setNameOfPL2("Oops");
		h.setNameOfPL3("full stack");
		h.setRatings(4.5f);
		
		String a=h.getNameOfPL1();
		System.out.println(a);
		String b=h.getNameOfPL2();
		System.out.println(b);
		String c=h.getNameOfPL3();
		System.out.println(c);
		float d=h.getRatings();
		System.out.println(d);
	}

}
