package com.simplilearn.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {
		
		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		String username = "John";
		
		String response = username.concat(" Smith"); // concat() -> update / modify string java ( appends a new text at the end of the string.)

		System.out.println(username);  // old name -> John
		System.out.println(response);  // new name -> new string -> John Smith
	}

}
