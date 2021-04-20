package com.simplilearn.stringhandling;

public class StringExample {

	public static void main(String[] args) {
		
		// string literal 
		String str1 = "Hello";
		
		String str2 = "Hello";  // it does not create a new string
		
		// Each time you create a string literal, the JVM checks the "string constant pool" first. 
		// If the string already exists in the pool, a reference to the pooled instance is returned. 
		
		if(str1 == str2) {
			System.out.println("Same String ...");
		} else {
			System.out.println("Different  String ...");
		}
		
		// string with new keyword
		String username1 = new String("John Smith");
		
		String username2 = new String("John Smith");
		
		// Each Time new keyword is going to generate new string reference.
		if(username1 == username2) {
			System.out.println("Same String ...");
		} else {
			System.out.println("Different  String ...");
		}
	}

}
