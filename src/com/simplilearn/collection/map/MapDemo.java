package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		phoneBook.put("john", 9797979797L);
		phoneBook.put("mike", 8989898990L);
		phoneBook.put("william", 8989898990L);
		phoneBook.put("amit", 4989898990L);
		phoneBook.put("rahul", 1989898990L);
		
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.get("john"));
		
		// Traversing Map
		// iterator
		// for loop
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println("Key "+entry.getKey());
			System.out.println("Value "+entry.getValue());
		}
	}

}
