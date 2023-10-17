package com.xworkz.september.things;

public class Game {
int index=0;
String[] gameName=new String[4];
public void onSave(String gameList) {
	System.out.println("gameName:"+gameList);
	if(index<gameName.length) {
		gameName[index]=gameList;
		index++;
	}else {
		System.out.println("gameNames are full");
	}
}
	public  void getElements() {
		for(int i=0;i<gameName.length;i++) {
			System.out.println("gameList.................:"+gameName[i]);
		}
	}
		
//update
		public void update(String oldElement,String NewElement) {
			for(int i=0;i<gameName.length;i++) {
				if(gameName[i]==oldElement) {
					gameName[i]=NewElement;
					
				}
			}
		}
//delete
	public void delete(String element) {
		for (int i=0;i<gameName.length;i++) {
			if(gameName[i]==element) {		
			gameName[i]=null;
		}else {
			System.out.println("element is not found");
			break;
		}	
		if(i==(gameName.length-1)&&gameName[i]!=element) {
			System.out.println("Not Exist...");
		}
		}
	}
	}
		
