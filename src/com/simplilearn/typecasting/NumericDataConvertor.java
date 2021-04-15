package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// TODO :: step1: collect a user input from console
		Scanner input = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println(" :: Welcome to Numeric Convertor :: ");
		System.out.println(" :: Enter a Integer number value :: ");
		System.out.println("------------------------------------");
		int userInput = input.nextInt();
		
		
		// step2 convert user input into different number conversion.
		// implicit type cast
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explicit type cast
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		System.out.println("--- Implicit & Explicit Conversions are ----");
		
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		
		System.out.println("Long value : "+bigValue);
		System.out.println("Float value : "+floatValue);
		System.out.println("Double value : "+doubleValue);

	}

}
