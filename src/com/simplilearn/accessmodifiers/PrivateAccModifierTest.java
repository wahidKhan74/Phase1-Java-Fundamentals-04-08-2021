package com.simplilearn.accessmodifiers;

public class PrivateAccModifierTest {

	public static void main(String[] args) {
		
		// create object
		Father father = new Father();
		
		// father.bankMoney;  // compile time error
		// System.out.println(father.fixDeposit);  // compile time error
		// father.showBalance();  // compile error
		
		father.showMoney();
	}

}

class Father {
	
	// data member : properties 
	// private varibles
	private double bankMoney = 83454.23d;
	private double fixDeposit = 12132;
	
	// private method : member function
	private double showBalance() {
		return bankMoney;
	}
	
    // public method
	public double showMoney() {
		System.out.println("Total Money :: "+( bankMoney + fixDeposit));
		return bankMoney;
	}
	
	// default constructor : zero parameter/ arg constructor
	// Note : Private Constructor based class can not be instantiated.
	// private Father() { }
	
	
}
