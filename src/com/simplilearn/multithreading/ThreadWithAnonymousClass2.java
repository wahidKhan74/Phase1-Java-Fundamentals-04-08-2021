package com.simplilearn.multithreading;

public class ThreadWithAnonymousClass2 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("t1 says : Hi");
				}
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("t2 says : Hi");
				}
			}
		});
		t2.start();
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 5; i++) {
					System.out.println("t3 says : Hi");
				}
			}
		});
		
		t3.start();
		
	}
}