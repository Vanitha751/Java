package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Indoor;

public class SportsRunner {
public static void main(String[] args) {
	Indoor i=new Indoor();
	i.setName("Cricket");
	i.setNumberOfPlayers(11);
	i.setEquipment("bat,ball");
	i.setPlayingSurface("ground");
	String n=i.getName();
	System.out.println(n);
	int p=i.getNumberOfPlayers();
	System.out.println(p);
	String e=i.getEquipment();
	System.out.println(e);
	String s=i.getPlayingSurface();
	System.out.println(s);
}
}
