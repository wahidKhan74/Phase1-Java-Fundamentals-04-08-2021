package com.simplilearn.exception.handling.bank;

public class Account {
	
	public int accNo;
	public String name;
	public double balance;
	
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
	}
	
}
