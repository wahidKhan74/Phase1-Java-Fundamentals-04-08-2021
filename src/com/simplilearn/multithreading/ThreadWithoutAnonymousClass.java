package com.simplilearn.multithreading;

public class ThreadWithoutAnonymousClass {
	
	public static void main(String[] args) {
		
		ThreadABC abc = new ThreadABC();
		Thread t1 = new Thread(abc);
		t1.start();
		
		ThreadXYZ xyz = new ThreadXYZ();
		Thread t2 = new Thread(xyz);
		t2.start();
		
	}
}

class ThreadABC implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadABC says : Hi");
		}
	}
}


class ThreadXYZ implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadXYZ says : Hi");
		}
	}
}