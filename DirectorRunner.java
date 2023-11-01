package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Movie;

public class DirectorRunner {
	public static void main(String[] args) {
			Movie m=new Movie();
		m.setName("RabindranthTagore");
		m.setAge(500);
		m.setNationality("Indian");
		m.setAwards("Nobel");
		String a=m.getName();
		System.out.println(a);
		int b=m.getAge();
		System.out.println(b);
		String c=m.getAwards();
		System.out.println(c);
		String d=m.getNationality();
		System.out.println(d);
	}

}
