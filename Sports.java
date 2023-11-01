package com.xworkz.shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sports {
	private String name;
    private int numberOfPlayers;
    private String equipment;
    private String playingSurface;
	public Sports() {
		System.out.println("No-Args constructor");
	}
	public Sports(String name, int numberOfPlayers, String equipment, String playingSurface) {
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
		this.equipment = equipment;
		this.playingSurface = playingSurface;
		System.out.println("All args constructor");
	}


}
