package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// List  -> Order collection of data with duplicates elements.
		// List (interface) ->  classes -> ArrayList, LinkedList , Vector , Stack

		// Deceleration
//		List<String> list1  = new ArrayList<String>();  // not thread safe  -> read operation
//		List<String> list2  = new LinkedList<String>();  // not thread safe  -> insert / delete / replace
//		List<String> list3  = new Vector<String>();   // thread safe
//		List<String> list4  = new Stack<String>();    // thread safe
		
		
		List<String> nameslist  = new ArrayList<String>(); 
		nameslist.add("Bob");
		nameslist.add("Smith");
		nameslist.add("John");
		nameslist.add("Bob");
		nameslist.add("Ajay");
		
		System.out.println(nameslist);
		
		// fetch element from array list
		System.out.println("The lement at index 2 : "+nameslist.get(2));
		
		// list traversing with iterator
		Iterator<String> itr = nameslist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------");
		// Enhance for loop
		for(String name : nameslist ) {
			System.out.println(name);
		}
	}

}
