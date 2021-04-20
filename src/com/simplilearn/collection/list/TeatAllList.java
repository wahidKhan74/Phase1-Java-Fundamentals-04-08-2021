package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TeatAllList {

	public static void main(String[] args) {
		
		// array list  -> read operations
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("DELL");
		
		System.out.println(listOfCompanies);
		System.out.println(listOfCompanies.get(2));
		
		// linked list -> insert / delete
		List<String> listOfCities = new LinkedList<String>();
		
		listOfCities.add("Mumbai");
		listOfCities.add("Pune");
		listOfCities.add("Hyderabad");
		listOfCities.add("Mumbai");
		listOfCities.add("New York");
		
		System.out.println(listOfCities);
		System.out.println(listOfCities.get(2));
		
		// Vector -> thread safe collection
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Apple");
		listOfFruits.add("Kiwi");
		
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(2));
		
	}

}
