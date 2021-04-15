package com.simplilearn.typecasting;

public class TypeCastingDemo {

	// Type Casting : The process of converting data from one type to another type.
	
	/**
	 * 1. Widening Type Casting :- Converts data from lower range to higher range type.
	 * byte -> short -> int -> long -> float -> double.
	 */
	public static void main(String[] args) {
		
		byte smallCount = 100;  // -128 to 127 -> 1 byte= 8 bit
		
		int intCount = smallCount;  // widening -> byte -> int
		
		long bigCount = intCount ; // widening -> int -> long
		
		float floatCount = bigCount ; // widening -> long -> float
		
		double decimalCount = bigCount;  // widening -> long -> double
		
		System.out.println("Byte Count : "+smallCount);
		System.out.println("Integer Count : "+intCount);
		System.out.println("Long Count : "+bigCount);
		System.out.println("Float Count : "+floatCount);
		System.out.println("Decimal Count : "+decimalCount);

	}

}
