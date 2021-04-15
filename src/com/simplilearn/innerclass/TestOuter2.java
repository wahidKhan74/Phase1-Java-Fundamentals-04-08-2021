package com.simplilearn.innerclass;

public class TestOuter2 {
	
	private static int data = 1000;
	public static String message = "Today is good day !";
	
	// static inner class
	static class TestInner {
		
		private String message2 = "Tommorow is a wonderfull day!";
		
		public void showData() {
			System.out.println("Outer class Data :: "+data);
			System.out.println("Outer class Message  :: "+message);
			System.out.println("Inner class message :: "+message2);
		}
		
	}
	
	// main method
	public static void main(String[] args) {
		
		// create inner class object
		TestOuter2.TestInner inner =  new TestOuter2.TestInner();
		
		// call method
		inner.showData();
	}
	
}
