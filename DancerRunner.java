package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Person;

public class DancerRunner {
	public static void main(String[] args) {
		Person p=new Person();
		p.setDanceName("kolatam");
		p.setStudentName("sivani");
		p.setSongName("VeyiNamalaVadaVenkatesa");
		p.setMarks(50);
		String a=p.getDanceName();
		System.out.println(a);
		String b=p.getSongName();
		System.out.println(b);
		String c=p.getStudentName();
		System.out.println(c);
		int d=p.getMarks();
		System.out.println(d);
		
	}

}
