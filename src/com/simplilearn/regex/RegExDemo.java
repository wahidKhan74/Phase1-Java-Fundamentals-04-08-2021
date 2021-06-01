package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		// second character match.
		String data = "Zn";
		
		//1. pattern 
		Pattern pattern = Pattern.compile(".n");
		
		//2. matcher
		Matcher matcher = pattern.matcher(data);
		
		// 3. call matches()
		boolean result = matcher.matches();
		
		System.out.println("Result 1 : "+ result);
		
		// shorter syntax
		boolean result2 =   Pattern.compile(".m").matcher("Xp").matches();
		System.out.println("Result 2 : "+ result2);
		
		// shortest syntax
		boolean result3 =  Pattern.matches(".m", "Ym");
		System.out.println("Result 3 : "+ result3);

	}

}
