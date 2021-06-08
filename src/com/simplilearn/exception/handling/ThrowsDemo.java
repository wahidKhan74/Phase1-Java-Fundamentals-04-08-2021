package com.simplilearn.exception.handling;

import java.io.IOException;

public class ThrowsDemo {
	// throws : throws keyword is used to declare exception.
	
	//calling method
	public static void main(String[] args) {
		try {
			ageValidator(2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void ageValidator(int age) throws IOException{
		if(age>20) {
			System.out.println("Your age is a valid age, Welcome onboard!");
		} else {
			// throw :: throw keyword is used to throw an exception
			throw new IOException("Not a valid age !");
		}
	}

}