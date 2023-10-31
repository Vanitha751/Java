package com.xworkz.september.driver;

import com.xworkz.september.things.Bank;
import com.xworkz.september.things.FD;
import com.xworkz.september.things.Account;
import com.xworkz.september.things.Online;
import com.xworkz.september.things.Payment;
import com.xworkz.september.things.RD;

public class BankRunner {
public static void main(String[] args) {
	Bank bank=new Bank();
	bank.setBankName("canara");
	bank.setLocation("Tiruchanoor");
	bank.setNoOfBranches(10);
	bank.setPayment(null);
	bank.setAccount(null);
	bank.getBankName();
	bank.getLocation();
	bank.getNoOfBranches();
	bank.getAccount();
	bank.getPayment();
	
	Account account=new Account();
	account.setAccountName("canara bank");
	account.setAccountHolder("vanitha");
	account.setBalance(200000);
	account.setFd(null);
	account.setRd(null);
	account.getAccountName();
	account.getAccountHolder();
	account.getBalance();
	account.getFd();
	account.getRd();
	
	Online online=new Online();
	online.setPhonePay("UPI");
	online.setGooglePay("app");
	online.setTransactionId(987654321L);
	online.getPhonePay();
	online.getGooglePay();
	online.getTransactionId();
	
	Payment payment= new Payment();
	payment.setPersonName("shivani");
	payment.setOnline(true);
	payment.setTotalAmmount(20000);
	payment.setOnline1(online);
	
	FD fd= new FD();
	fd.setDepositeAmount("four thousand");
	fd.setFixedAmmount(2000);
	fd.setOnlinepayment(false);
	fd.getFixedAmmount();
	fd.getDepositeAmount();
	fd.isOnlinepayment();
	
	RD rd= new RD();
	rd.getDepositeAmmount();
    rd.getTotalAmmount();
    rd.isInterest();
    rd.setInterest(false);
    rd.setDepositeAmmount(20000);
    rd.setTotalAmmount(12020);
	System.out.println(bank.getBankName());
	System.out.println(bank.getLocation());
	System.out.println(bank.getNoOfBranches());
	System.out.println(account.getAccountName());
}
}
