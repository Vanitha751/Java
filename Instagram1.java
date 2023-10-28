package com.xworkz.september.things;

public class Instagram1 {
public String userName;
public String passWord;
public String email;
public long contactNumber;
public String address;
public int accountCreatedDate;
public String gender;
public Instagram1(){
	
}
public Instagram1(String userName){
	this("pachappagarivanitha","vanithap","pachappagarivaitha@gmail.com",8639112031l,"tirupathi",18/12/2002,"female");
	this.userName=userName;
	System.out.println("this is first constructor");
	System.out.println("username:"+this.userName);
	
}
public Instagram1(String userName,String passWord){
	this();
	System.out.println("this is second constructor");
	this.userName=userName;
	this.passWord=passWord;
	System.out.println("username:"+this.userName+" "+"passWord:"+this.passWord);
}
public Instagram1(String userName,String passWord,String email){
	this("pachappagarivanitha","shivani");
	System.out.println("this is third constructor");
	this.userName=userName;
	this.passWord=passWord;
	this.email=email;
	System.out.println("username:"+this.userName+" "+"passWord:"+this.passWord+" "+"email:"+this.email);
}
public Instagram1(String userName,String passWord,String email,long contactNumber,String address,int accountCreatedDate,String gender){
	System.out.println("this is 4th constructor");
	this.userName=userName;
	this.passWord=passWord;
	this.email=email;
	this.contactNumber=contactNumber;
	this.address=address;
	this.accountCreatedDate=accountCreatedDate;
	this.gender=gender;
	System.out.println("username:"+this.userName+" "+"passWord:"+this.passWord+" "+"email:"+this.email+" "+"contactNumber:"+this.contactNumber+" "+"address:"+this.address+" "+"accountCreatedDate:"+this.accountCreatedDate+" "+"gender:"+this.gender);
}
}
