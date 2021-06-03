package com.simplilearn.multithreading;

public class ThreadWithAnonymousClass {
	
	public static void main(String[] args) {
		
		Runnable obj1 = new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("ThreadABC says : Hi");
				}
			}
		};
		
		Thread t1 = new Thread(obj1);
		t1.start();
		
		Runnable obj2 = new Runnable(){
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("ThreadXYZ says : Hi");
				}
			}
		};
		Thread t2 = new Thread(obj2);
		t2.start();
		
	}
}