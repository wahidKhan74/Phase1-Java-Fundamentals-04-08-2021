package com.simplilearn.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		// array is a ordered collection of similar type data values.
		int numbers[] = { 10, 20, 30, 40, 50, 60 };

		String[] names = { "John", "Mike", "David" };

		System.out.println("element at index 1 : " + numbers[1]);
		System.out.println("element at index 0 : " + names[0]);
		System.out.println("=====");

		// names[1] = "Mikey";
		
		// iterate over an  numbers array.
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("element at index " + index + " value " + numbers[index]);
		}
		
		System.out.println("=====");
		// iterate over an string array.
		for (int index = 0; index < names.length; index++) {
			System.out.println("element at index " + index + " value " + names[index]);
		}
		
		System.out.println("===== replace mike with mikey ====");
		
		for (int index = 0; index < names.length; index++) {
			if(names[index].equals("Mike")) {
				names[index] = "Mikey";
			}
		}
		System.out.println(Arrays.toString(names));
		
	}

}
