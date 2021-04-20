package com.simplilearn.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetCollection {

	public static void main(String[] args) {

		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// HashSet -> use hashcode of the object to store values.
		Set<String> setOfUniqueCompanies = new HashSet<>();

		boolean res1 = setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("ABC");
		setOfUniqueCompanies.add("XYZ");
		boolean res2 = setOfUniqueCompanies.add("DELL");

		System.out.println(setOfUniqueCompanies);
		System.out.println("Reponse 1 " + res1);
		System.out.println("Reponse 2 " + res2);

		// enhance for loop
		for (String comp : setOfUniqueCompanies) {
			System.out.println(comp);
		}

		System.out.println("==========");
		
		
		// LinkedHashSet
		Set<String> setOfUniqueCities = new LinkedHashSet<>();

		boolean res3= setOfUniqueCities.add("Mumbai");
		setOfUniqueCities.add("Hyderbad");
		setOfUniqueCities.add("Pune");
		boolean res4 =  setOfUniqueCities.add("Mumbai");

		System.out.println(setOfUniqueCities);
		System.out.println("Reponse 3 " + res3);
		System.out.println("Reponse 4 " + res4);
		// enhance for loop
		for (String city : setOfUniqueCities) {
			System.out.println(city);
		}
		
		
		// TreeSet	 => arrange data into ascending or descending 
		// default order is ascending.
		TreeSet<String> setOfUniqueNames = new TreeSet<String>();
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Mike");
		setOfUniqueNames.add("Will");
		setOfUniqueNames.add("Bryan");
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Jeet");
		
		System.out.println(setOfUniqueNames);
		
		System.out.println(setOfUniqueNames.descendingSet());
		
	}

}
