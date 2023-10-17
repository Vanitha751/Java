package com.xworkz.september.driver;
import com.xworkz.september.things.*;
public class BankAccountRunner {
public static void main(String args[]) {
	new BankAccount();
	new BankAccount("Syndicate");
	new BankAccount("Syndicate","pachappagarivanitha");
	new BankAccount("Syndicate","pachappagarivanitha",369258471024l);
	new BankAccount("Syndicate","pachappagarivanitha",369258471024l,(short) 30);
	new BankAccount("Syndicate","pachappagarivanitha",369258471024l,(short)300000,"tirupathi");
}
}