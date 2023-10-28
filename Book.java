package com.xworkz.september.things;

public class Book {
public String title;
public String author;
public long ISBN;
public int year;
public String generation;

public Book() {
	
}
public Book(String title) {
	this.title=title;
	System.out.println("title:"+" "+this.title);
}
public Book(String title,String author) {
	this.title=title;
	this.author=author;
	System.out.println("title:"+" "+this.title+" "+"author:"+" "+this.author);
}
public Book(String title,String author,long ISBN) {
	this.title=title;
	this.author=author;
	this.ISBN=ISBN;
System.out.println("title:"+" "+this.title+" "+"author:"+" "+this.author+" "+"ISBN:"+" "+this.ISBN);
}
public Book(String title,String author,long ISBN,int year) {
	this.title=title;
	this.author=author;
	this.ISBN=ISBN;
	this.year=year;
	System.out.println("title:"+" "+this.title+" "+"author:"+" "+this.author+" "+"ISBN:"+" "+this.ISBN+" "+"year:"+" "+this.year);
}
public Book(String title,String author,long ISBN,int year,String generation) {
	this.title=title;
	this.author=author;
	this.ISBN=ISBN;
	this.year=year;
	this.generation=generation;
	System.out.println("title:"+" "+this.title+" "+"author:"+" "+this.author+" "+"ISBN:"+" "+this.ISBN+" "+"year:"+" "+this.year+" "+"generation:"+" "+this.generation);
}

}
