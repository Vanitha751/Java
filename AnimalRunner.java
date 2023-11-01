package com.xworkz.shopping.driver;

import com.xworkz.shopping.things.Dog;

public class AnimalRunner {
	    public static void main(String[] args) {
	        Dog d=new Dog();
	        d.setNameOfTheAnimal("Kanna");
	        d.setAge(2);
	        d.setGender("male");
	        d.setLocation("Bangloor");
	        String nameOfTheAnimal=d.getNameOfTheAnimal();
	        System.out.println(nameOfTheAnimal);
	        int age=d.getAge();
	        System.out.println(age);
	        String location=d.getLocation();
	        System.out.println(location);
	        String gender=d.getGender();
	        System.out.println(gender);
	    }

}
