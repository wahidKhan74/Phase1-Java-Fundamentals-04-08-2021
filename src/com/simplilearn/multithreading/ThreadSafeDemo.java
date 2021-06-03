package com.simplilearn.multithreading;

class Counter {

	int count;

	// incease count -> synchronized 
	public synchronized void increaseCount() {
		count++; // count = count + 1;
	}

	public void decreaseCount() {
		count--;
	}
}

public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		// create threads
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increaseCount();
			}

		});

		// create threads
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increaseCount();
			}
		});

		// create threads
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increaseCount();
			}
		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("The Count : " + counter.count);

	}

}
