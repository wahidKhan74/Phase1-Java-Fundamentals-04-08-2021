package com.simplilearn.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		
		// create thread bob
		Bob bob  = new Bob();
		bob.working();
		Thread t1 = new Thread(bob);		
		t1.start();
		
		// create thread will
		Will will = new Will();
		Thread t2 = new Thread(will);
		t2.start();
	}

}

class Work {
	public void working(){
		System.out.println("Working ...");
	}
}

class Bob extends Work implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Bob says : Hi");
		}
	}
}

class Will implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Will says : Hello");
		}
	}
}