package com.simplilearn.innerclass;

public class TestOuter {
	
	private int data = 1000;
	public String message = "Today is good day !";
	
	// non static inner class
	class TestInner {
		
		private String message2 = "Hello, & Welcome";
		
		public void showData() {
			System.out.println("Outer class Data :: "+data);
			System.out.println("Outer class Message  :: "+message);
			System.out.println("Inner class message :: "+message2);
		}
		
	}
	
	// main method
	public static void main(String[] args) {
		
		// create outer class object
		TestOuter outer = new TestOuter();
		
		// create inner class object
		TestOuter.TestInner inner = outer.new TestInner();
		
		// call method
		inner.showData();
	}
	
}
