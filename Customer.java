package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Customer {
	 private String name;
	    private String email;
	    public Customer() {
	    	System.out.println("No-args constructor");
	    }
		public Customer(String name, String email) {
			this.name = name;
			this.email = email;
			System.out.println("all args constructor");
			
		}

	
			
}
