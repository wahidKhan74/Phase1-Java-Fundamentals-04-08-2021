package com.simplilearn.methods.bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// call bank operation
		BankOperation operation = new BankOperation();

		operation.welcomeMessage("XYZ Bank");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter User Name ");
		String username = input.nextLine();

		System.out.println("Enter User Balance ");
		double balance = input.nextDouble();

		System.out.println("Enter User Acount No ");
		long accountNo = input.nextLong();

		// create account object
		Account account = new Account(accountNo, balance, username);

		operation.showBalance(account);
		
		
		System.out.println("Enter Withdraw amount ");
		double amount = input.nextDouble();
		
		double response = operation.withdrawAmount(account, amount);
		System.out.println("The amount after withdraw  : " + response);

	}

}
