package com.simplilearn.methods;

public class CalculatorTest {

	// default main method
	public static void main(String[] args) {
		
		CalculatorTest test = new CalculatorTest();
		
		// method calling
		test.showMessage();
		test.displayAuthor("John Smith");
		test.displayDetails("john.smith@gmail.com", " Fullstack developer.");
		
		// call calculator methods
		test.add(200, 100);
		test.sub(200, 100);
	}

	// user defined method -> 1. parameterized method or 2. non parameterized method
	// signature : access-modifer return-type methodName() { --- method body / logic
	// ----}

	// zero parameterized function
	public void showMessage() {
		System.out.println(" :: Welcome to Test Calculator ::: ");
	}

	// one parameterized function
	public void displayAuthor(String name) {
		System.out.println(" :: @Author : " + name);
	}

	// multi (two)  parameterized function
	public void displayDetails(String email, String description) {
		System.out.println(" :: @Author email : " + email + "  description : "+ description);
	}
	
	// Arithmetic calculator operations
	public void add(float num1 , float num2 ) {
		float result = num1 + num2;
		System.out.println(" The Addition : "+num1 +" + "+num2 + " = "+result);
	}
	
	public float sub(float num1 , float num2 ) {
		float result = num1 - num2;
		System.out.println(" The Substraction : "+num1 +" - "+num2 + " = "+result);
		return result;
	}
	
	// TODO : WA method as mul or div and avg.
	
	
	
}
