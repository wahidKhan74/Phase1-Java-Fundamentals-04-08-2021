package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternRealExample {

	public static void main(String[] args) {
		
		// WA pattern for that accepts alphanumeric characters only.
		String username = "wahidK74";
		String pattern1 = "[a-zA-z0-9]+";
		System.out.println(Pattern.matches(pattern1, username));
		
		System.out.println("--");
		// WA pattern  for that accepts alphanumeric characters  but only of length 10
		String username2 = "wahidK7412";
		String pattern2 = "[a-zA-z0-9]{10}";
		System.out.println(Pattern.matches(pattern2, username2));  //true exact 10 char match
		System.out.println(Pattern.matches(pattern2, "sdfsdfWMM1234"));// false-> // more than 10 char
		System.out.println(Pattern.matches(pattern2, "sdfs")); // false ->  more than 10 char
		
		System.out.println("--");
		// WA pattern for firstName where only small alphabets allowed up to 6 char
		String firstName = "wahid";
		String pattern3 = "[a-z]{0,6}";
		System.out.println(Pattern.matches(pattern3, firstName));  //true 
		
		
		// WA pattern for email where only small alphabets with number allowed up to 15 char
		String email = "wahid12gmailcom";
		String pattern4 = "[a-z0-9]+{0,15}";
		System.out.println(Pattern.matches(pattern4, email));  //true 
		
		
		// WA pattern for email where only small alphabets with number and @ special allowed up to 15 char
		String email2 = "wahid12@gmail.com";
		String pattern5 = "[a-z0-9]+(.+)@(.+){0,15}";
		System.out.println(Pattern.matches(pattern5, email2));  //true 
	}

}
