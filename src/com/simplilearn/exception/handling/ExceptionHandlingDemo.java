package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Program Initiated !");
		
		try {
			int balance = 2000;
			int amount = 20;
			
			int result = balance / amount;
			
			System.out.println("Result : "+result);
		} catch (Exception e) {
			System.out.println("Exception Occurs : "+e.getClass());
		} finally {
			System.out.println("Always excute !");
		}
		
		System.out.println("Program Terminated !");
	}

}
