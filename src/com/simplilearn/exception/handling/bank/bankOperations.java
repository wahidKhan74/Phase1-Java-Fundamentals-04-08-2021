package com.simplilearn.exception.handling.bank;

import java.util.ArrayList;
import java.util.List;

public class bankOperations {

	public static void main(String[] args) {
		
		//bank user list
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(101, "Tony Stark", 9787632));
		accounts.add(new Account(102, "John Smith", 7632));
		accounts.add(new Account(103, "Will Smith", 78632));
		accounts.add(new Account(104, "Thanos", 34587632));

		showBalance(105,accounts);
		depositAmount(103,accounts,0);
	}

	// show balance
	private static void showBalance(int accNo, List<Account> accounts) {
		try {
			int count =0;
			for(Account acc: accounts) {
				if(acc.accNo == accNo) {
					System.out.println("The Account '"+acc.accNo +"' user '"+acc.name +"' has balance " +acc.balance);
					count++;
				}
			}
			if(count==0) {
				throw new AccountNotFoundException("Account Does not exist with accNo. "+accNo);
			}
		} catch (AccountNotFoundException e) {
			System.out.println(e);
		}		
		
	}
	
	// deposit amount
	private static void depositAmount(int accNo, List<Account> accounts, double amount) {
		
		try {
			int count =0;
			for(Account acc: accounts) {
				if(acc.accNo == accNo) {
					System.out.println("Before Account '"+acc.accNo +"' user '"+acc.name +"' has balance " +acc.balance);
					// deposit 
					if(amount<=0 || amount>100000) {
						throw new InvalidTxException("Invalid deposit amount min=1 & max=100000 ");
					}
					acc.balance += amount;
					System.out.println("After: Account '"+acc.accNo +"' user '"+acc.name +"' has balance " +acc.balance);
					count++;
				}
			}
			if(count==0) {
				throw new AccountNotFoundException("Account Does not exist with accNo. "+accNo);
			}
		} catch (InvalidTxException e) {
			System.out.println(e);
		}	
		
	}
	
	// withdraw amount
	// InvalidDataException , InvalidOperationException
	// calculate interest
}
