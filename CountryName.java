package com.xworkz.september.things;
public class CountryName {
	int index=0;
	String[] countryName=new String[3];
	public void onSave(String countryList) {
		System.out.println("countryName:"+countryList);
		if(index<countryName.length) {
			countryName[index]=countryList;
			index++;
		}else {
			System.out.println("CountryNames are full");
		}
	}
		public  void getElements() {
			for(int i=0;i<countryName.length;i++) {
				System.out.println("gameList.................:"+countryName[i]);
			}
		}
			public void update(String oldElement,String NewElement) {
				for(int i=0;i<countryName.length;i++) {
					if(countryName[i]==oldElement) {
						countryName[i]=NewElement;		
					}
				}
			}
		public void delete(String element) {
			for (int i=0;i<countryName.length;i++) {
				if(countryName[i]==element) {		
					countryName[i]=null;
			}else {
				System.out.println("element is not found");
				break;
			}	
			if(i==(countryName.length-1)&&countryName[i]!=element) {
				System.out.println("Not Exist...");
			}
			}
		}
		}
			

