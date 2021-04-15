package com.simplilearn.methods.school;

public class StaticTest {
	
	// static variable
	private static String username = "John Smith";
	
	// non static varible
	private String email = "john.smith@gmail.com";
	
	// static method
	public static void showMessage() {
		System.out.println("hello , static method .");
	}
	
	// non static method
	public void displayMessage() {
		System.out.println("hello , non static method .");
	}
	
	public static void main(String[] args) {
		
		// access static variable and methods
		System.out.println("------access static variable and methods ------");
		System.out.println(StaticTest.username);
		StaticTest.showMessage();
		
		// access non static variable and method
		System.out.println("------access non static variable and methods ------");
		StaticTest test = new StaticTest();
		System.out.println("Email : "+test.email);
		test.displayMessage();
		
	}
}

//static and new keyword are the memory allocation keyword
//static keyword allocate on time memory
//new keyword allocate memory as many time as you create object