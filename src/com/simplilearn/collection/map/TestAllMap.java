package com.simplilearn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		
		Map<String, Double> listOfItems = new HashMap<String, Double>();
		listOfItems.put("Orange", 44.5);
		listOfItems.put("Apple", 44.5);
		listOfItems.put("TV", 234244.5);
		listOfItems.put("Oil", 3444.5);
		listOfItems.put("XYZ", 144.5);
		
		System.out.println(listOfItems);
		System.out.println("-----------------");
		Map<String, Integer> listOfCity = new LinkedHashMap<String, Integer>();
		listOfCity.put("GOA", 258122);
		listOfCity.put("DELHI", 545121);
		listOfCity.put("GUJRAT", 893711);
		listOfCity.put("Mumbai", 2581212);
		
		System.out.println(listOfCity);
		System.out.println("-----------------");
		Map<Integer, String> listOfEmploye= new TreeMap<Integer, String>();
		listOfEmploye.put(101, "John Smith");
		listOfEmploye.put(103, "Mike Smith");
		listOfEmploye.put(102, "Will Smith");
		listOfEmploye.put(104, "Mark Smith");
		System.out.println(listOfEmploye);
	}

}
