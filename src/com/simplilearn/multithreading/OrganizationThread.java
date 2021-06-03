package com.simplilearn.multithreading;

public class OrganizationThread {

	// main thread
	public static void main(String[] args) {

		// create a new thread for john
		John t1 = new John();
		t1.start();

		// create a new thread for mike
		Mike t2 = new Mike();
		t2.start();

		// create a new thread for david
		David t3 = new David();
		t3.start();
	}

}


class John extends Thread {

	@Override
	public void run() {
		System.out.println("John Thread is running ...");
	}
}

class Mike extends Thread {

	@Override
	public void run() {
		System.out.println("Mike Thread is running ...");
	}
}

class David extends Thread {

	@Override
	public void run() {
		System.out.println("David Thread is running ...");
	}
}
