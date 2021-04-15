package com.simplilearn.methods.bank;

// simple plan java class ( POJO class - encapsulated class)
public class Account {

	public long accountNo;
	public double balance;
	private String userName;
	private String bankName ;
	
	//default constructor 
	public Account () {}
	
	// parameterized constructor : to instantiate default value  of object
	public Account(long accountNo, double balance, String userName){
		this.accountNo = accountNo;
		this.balance = balance;
		this.userName = userName;
		this.bankName = "XYZ Bank";
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
}
