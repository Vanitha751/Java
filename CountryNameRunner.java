package com.xworkz.september.driver;
import com.xworkz.september.things.*;
public class CountryNameRunner {
public static void main(String args[]) {
	CountryName countryName=new CountryName();
	countryName.onSave("India");
	countryName.onSave("U.S");
	countryName.onSave("U.K");
	countryName.update("U.S","Africa");
	countryName.getElements();
	countryName.delete("U.K");
	countryName.getElements();
}
}
