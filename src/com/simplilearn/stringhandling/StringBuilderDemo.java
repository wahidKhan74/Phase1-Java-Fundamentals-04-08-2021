package com.simplilearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder message = new StringBuilder("Today is a wonderfull day !");

		System.out.println(message);

		// append
		message.append(" Happy eating !");
		System.out.println(message);

		// insert
		message.insert(0, "Welcome, ");
		System.out.println(message);

		// replace -> replace text or char in string
		message.replace(0, 1, "t");
		System.out.println(message);

		// delete -> delete text or char in string
		message.delete(0, 1);
		System.out.println( message);
		
		// reverse
		message.reverse();
		System.out.println( message);
		

	}

}
