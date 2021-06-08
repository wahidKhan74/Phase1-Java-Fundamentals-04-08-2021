package com.simplilearn.exception.handling;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		// throw :: throw keyword is used to throw an exception
		ageValidator(20);
		
		// ageValidator(10);
		
		stringValidator("johnsmith");
		stringValidator(null);
		stringValidator("");
	}

	public static void ageValidator(int age) {
		if(age>18) {
			System.out.println("Your age is a valid age, Welcome onboard!");
		} else {
			// throw :: throw keyword is used to throw an exception
			throw new RuntimeException("Not a valid age !");
		}
	}
	
	private static void stringValidator(String str) {
		if(str != null && !(str.equals(""))) {
			System.out.println("Valid String !..");
		} else {
			try {
				throw new IOException("Not a valid string!");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
