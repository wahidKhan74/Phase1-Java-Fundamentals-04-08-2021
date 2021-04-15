package com.simplilearn.typecasting;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		/**
		 * Narrowing :- Convert data into incompatible type.
		 * Converts data from higher range to lower range value.
		 * double -> float -> long -> int -> short -> byte.
		 */
		
		double decimalPrice = 120.77d;
		
		long bigPrice = (long) decimalPrice;   // Narrowing -> double -> long
		
		int intPrice = (int) bigPrice;  // Narrowing -> long -> int
		
		short shortPrice = (short) intPrice; // Narrowing -> int -> short
		
		byte bytePrice = (byte) decimalPrice;  // Narrowing -> double -> byte
		
		System.out.println("Double Price :: "+decimalPrice);
		System.out.println("Long Price :: "+bigPrice);
		System.out.println("Integer Price :: "+intPrice);		
		System.out.println("Short Price :: "+shortPrice);
		System.out.println("Byte Price :: "+bytePrice);
	}

}
