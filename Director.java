package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Director {
	 private String name;
	    private int age;
	    private String nationality;
	    private String awards;
		public Director() {
			System.out.println("No-Args constructor");
		}
		public Director(String name, int age, String nationality, String awards) {
			this.name = name;
			this.age = age;
			this.nationality = nationality;
			this.awards = awards;
		}
		

}
