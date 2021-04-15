package com.simplilearn.typecasting;

public class StringToNumberConversion {

	public static void main(String[] args) {
		
		// String to Numeric Conversion :  The String value should a convertible value.
		String username ="wahid74a"; // non convertible string
		String price = "124";        // convertible string
		String amount = "126.77";  // convertible string
		
		// string -> int   (Wrapper class : Primitive type to object type)
		// int  -> Interger , byte  -> Byte , double -> Double
		int priceValue = Integer.parseInt(price);  
		
		// conversion from string to double
		double doubleAmount = Double.parseDouble(amount);
		
		
		// Non convertable string -> conversion -> NumberFormatException
//		int priceInt = Integer.parseInt(username);
		
		System.out.println("Interger Price :: "+priceValue);
		System.out.println("Double Amount :: "+doubleAmount);
		
	}

}
