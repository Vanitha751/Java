package com.xworkz.shopping.things;

public class Dog extends Animal{
	    public Dog() {
	        super("Sunamika",20,"forest","female");
	        System.out.println("This is derived class constructor");
	        System.out.println(super.getNameOfTheAnimal());
	        System.out.println(super.getAge());
	        System.out.println(super.getGender());
	        System.out.println(super.getLocation());
	    }
	}

