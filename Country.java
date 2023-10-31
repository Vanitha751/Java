package com.xworkz.september.things;

public class Country {
	public String name;
	public String capital;
	public long population;
	public String officialLanguage;
	public String currency;
public Country() {
	
}
public Country(String name) {
	this.name=name;
	System.out.println("name:"+" "+this.name);
}
public Country(String name,String capital) {
	this.name=name;
	this.capital=capital;
	System.out.println("name:"+" "+this.name+" "+"capital:"+"this.capital");
}
public Country(String name,String capital,long population) {
	this.name=name;
	this.capital=capital;
	this.population=population;
	System.out.println("name:"+" "+this.name+" "+"capital:"+"this.capital"+" "+"population:"+"this.population");
}
public Country(String name,String capital,long population,String officialLanguage) {
	this.name=name;
	this.capital=capital;
	this.population=population;
	this.officialLanguage=officialLanguage;
	System.out.println("name:"+" "+this.name+" "+"capital:"+"this.capital"+" "+"population:"+"this.population"+" "+"officialLanguage:"+"this.officialLanguage");
}
public Country(String name,String capital,long population,String officialLanguage,String currency) {
	this.name=name;
	this.capital=capital;
	this.population=population;
	this.officialLanguage=officialLanguage;
	this.currency=currency;
	System.out.println("name:"+" "+this.name+" "+"capital:"+"this.capital"+" "+"population:"+"this.population"+" "+"officialLanguage:"+"this.officialLanguage"+" "+"currency:"+"this.currency");
}
}
