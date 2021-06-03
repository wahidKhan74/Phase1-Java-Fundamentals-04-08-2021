package com.simplilearn.multithreading;

class Customer {

	double balance = 1000.00;

	synchronized void deposit(int amount) {
		System.out.println(" Going to deposit ...");
		balance += amount;   /// balance = balance + amount;
		System.out.println(" Deposit completed ! new balance :" + balance);
		
		// initiate or resume blocking thread
		notifyAll();
	}

	synchronized void withdraw(int amount) {
		if(balance < amount) {
			System.out.println(" Less Amount .. ");
			try {
				wait(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance-= amount;
		System.out.println(" Withdraw completed ! new balance :" + balance);
		System.out.println("Thread Id : "+Thread.currentThread().getId());
	}
	
	synchronized void showBalnce() {
		System.out.println("The Blance: "+ balance);
	}
	

}

public class ThreadWithWait {
	
	public static void main(String[] args) {
		// create cutomer obj 
		Customer customer = new  Customer();
		
		Thread t1 = new Thread(()-> {
			customer.withdraw(30000);
		});
		
		t1.start();
		
		Thread t2 = new Thread(()-> {
			customer.deposit(50000);
		});
		
		t2.start();
		
		Thread t3 = new Thread(()-> {
			customer.showBalnce();
		});
		
		t3.start();
		
	}
}
