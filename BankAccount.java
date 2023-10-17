package com.xworkz.september.things;

public class BankAccount {
	public String bankName;
	public String accountantName;
	public long bankAccountNumber;
	public short balance;
    public String location;
    public BankAccount(){//default constructor
    	
    }
    public BankAccount(String bankName) {
    	this.bankName=bankName;
    	System.out.println("bankName:"+this.bankName);
    }
    public BankAccount(String bankName,String accountantName) {
    	this.bankName=bankName;
    	this.accountantName=accountantName;
    	System.out.println("bankName:"+this.bankName+" "+"accountantName:"+this.accountantName);
    }
    
    public BankAccount(String bankName,String accountantName,long bankAccountNumber) {
    	this.bankName=bankName;
    	this.accountantName=accountantName;
    	this.bankAccountNumber=bankAccountNumber;
       System.out.println("bankName:"+this.bankName+" "+"accountantName:"+this.accountantName+" "+"bankAccountNumber:"+this.bankAccountNumber);	
    }
    public BankAccount(String bankName,String accountantName,long bankAccountNumber,short balance) {
    	this.bankName=bankName;
    	this.accountantName=accountantName;
    	this.bankAccountNumber=bankAccountNumber;
    	this.balance=balance;
       System.out.println("bankName:"+this.bankName+" "+"accountantName:"+this.accountantName+" "+"bankAccountNumber:"+this.bankAccountNumber+" "+"balance:"+this.balance);	
    }
    public BankAccount(String bankName,String accountantName,long bankAccountNumber,short balance,String location) {
    	this.bankName=bankName;
    	this.accountantName=accountantName;
    	this.bankAccountNumber=bankAccountNumber;
    	this.balance=balance;
    	this.location=location;
       System.out.println("bankName:"+this.bankName+" "+"accountantName:"+this.accountantName+" "+"bankAccountNumber:"+this.bankAccountNumber+" "+"balance:"+this.balance+" "+"location:"+this.location);	
    }


}