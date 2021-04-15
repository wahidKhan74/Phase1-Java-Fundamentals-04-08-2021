package com.simplilearn.accessmodifiers;

public class PublicAccModifierTest {

	public static void main(String[] args) {
		
		// create object
		Mother mother = new Mother();
		
		// access variable
		System.out.println("Bank Money :: "+mother.bankMoney);
		System.out.println("Gold Money :: "+mother.gold);
		
		// access method
		System.out.println("Money Method :: "+mother.showMoney());
		
		mother.showAll();
	}

}

class Mother {
	
	// public variable 
	public double bankMoney = 233454;
	public double gold = 10;
	
	// public method
	public double showMoney() {
		return bankMoney;
	}
	
	public void showAll() {
		System.out.println("Money :: "+bankMoney +" Gold value :: "+gold);
	}
	
	// default constructor
	public Mother() {}
}