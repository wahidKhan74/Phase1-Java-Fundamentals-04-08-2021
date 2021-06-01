package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternExample2 {

	public static void main(String[] args) {
		
		// one  char sequence
		System.out.println(Pattern.matches("[xyz]", "a"));  // false -> it matches one value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]", "x"));  // true -> it matches one value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]", "xy"));  // false -> it matches one value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]", "xyz"));  // false -> it matches one value out of x,y,z.
		System.out.println(Pattern.matches("[xyz][xyz]", "xy"));  // true -> it matches two value out of x,y,z.
		System.out.println("--");
		
		// more than char sequence
		
		System.out.println(Pattern.matches("[xyz]+", "xy"));  // true -> it matches more than value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]+", "xyz"));  // true -> it matches more than value out of x,y,z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[xyz]?", "x"));  // true -> it matches one or zero value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]?", ""));  // true -> it matches one or zero value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]?", "xy"));  // false -> it matches one or zero value out of x,y,z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[xyz]*", "x"));  // true -> it matches zero or more value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]*", ""));  // true -> it matches zero or more value out of x,y,z.
		System.out.println(Pattern.matches("[xyz]*", "xx"));  // true -> it matches zero or more value out of x,y,z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[a-z]*", "x"));  // true -> it matches zero or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]*", ""));  // true -> it matches zero or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]*", "wahid"));  // true -> it matches zero or more value out of a to z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[a-z]+", "x"));  // true -> it matches one or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]+", ""));  // false -> it matches one or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]+", "pqr"));  // true -> it matches one or more value out of a to z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[A-Z]+", "x"));  // false -> it matches one or more value out of A to Z.
		System.out.println(Pattern.matches("[A-Z]+", "XYZ"));  // true -> it matches one or more value out of A to Z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[a-zA-Z]+", "mknPQR"));  // true -> it matches one or more value out of A to Z or a to z.
		System.out.println(Pattern.matches("[a-zA-Z]+", "1213"));  // false -> it matches one or more value out of A to Z or a to z.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[0-9]+", "x"));  // false -> it matches one or more value out of 0 to 9.
		System.out.println(Pattern.matches("[0-9]", "2"));  // true -> it matches one  out of 0 to 9.
		System.out.println(Pattern.matches("[0-9]+", "32198"));  // true -> it matches one or more value out of 0 to 9.
		
		System.out.println("--");
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "mknPQR432"));  // true -> it matches one or more value out of A to Z or a to z or 0 to 0.
		
		
		System.out.println("--");
		System.out.println(Pattern.matches("\\d", "mkn"));  //false (digit only 0-9)
		System.out.println(Pattern.matches("\\d", "4"));  //true (digit only 0-9)
		System.out.println(Pattern.matches("\\D", "p"));  //true (not digit )
		System.out.println(Pattern.matches("\\D", "8"));  //false (not digit )		
		
		
		
	}

}
