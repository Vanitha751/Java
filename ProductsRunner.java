package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Ecommerse;

public class ProductsRunner {
	public static void main(String[] args) {
	Ecommerse e=new Ecommerse();
	e.setId(2);
	e.setName("Laptop");
	e.setPrice(500000d);
	e.setDescription("Powerful laptop for working");
	int a= e.getId();
	System.out.println(a);
	String b=e.getName();
	System.out.println(b);
	double c=e.getPrice();
	System.out.println(c);
	String d=e.getDescription();
	System.out.println(d);
}

}
