package com.simplilearn.multithreading;

public class ThreadWithLambda {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()-> {
				for (int i = 0; i < 5; i++) {
					System.out.println("t1 says : Hi");
				}
		});
		t1.start();
		
		Thread t2 = new Thread(()-> {
				for (int i = 0; i < 5; i++) {
					System.out.println("t2 says : Hi");
				}
		});
		t2.start();
		
		Thread t3 = new Thread(()->{
			System.out.println("T3 thread ");
		});
		t3.start();
	}
		
}