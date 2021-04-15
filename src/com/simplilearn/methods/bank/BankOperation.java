package com.simplilearn.methods.bank;

public class BankOperation {
		
	// deposit amount 
	// interestCal amount 
	
	// welcome bank message	
	public void welcomeMessage(String bankName) {
		System.out.println("--------------------------");
		System.out.println(" :: Welcome to "+ bankName+ " ::: ");
		System.out.println("--------------------------");
	}
	
	// show balance
	public double showBalance(Account account) {
		System.out.println(" The User Balance is : " + account.getBalance());
		return account.getBalance();
	}
	
	// withdraw amount 
	public double withdrawAmount(Account account,double amount ) {
		if(amount> 0 || amount < account.balance) {
			// account.balance = account.balance - amount;
			account.balance -= amount;
			return account.balance;
		} else {
			System.out.println("The amount is not a valid amount !");
			return 0;
		}
		
	}

}
