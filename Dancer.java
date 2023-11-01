package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Dancer {
	private String DanceName;
	private String studentName;
	private String songName;
	private int marks;
	
	public Dancer() {
		System.out.println("Noargs constructor");
	}

	public Dancer(String danceName, String studentName, String songName, int marks) {
		DanceName = danceName;
		this.studentName = studentName;
		this.songName = songName;
		this.marks = marks;
		System.out.println("All args constructir");
	}


}
