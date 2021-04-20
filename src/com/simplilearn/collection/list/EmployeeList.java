package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		Employee emp1  = new Employee(1001, "John Smith", "Dev", 8765542);
		Employee emp2  = new Employee(1002, "Marry Smith", "Finance",65542);
		Employee emp3  = new Employee(1003, "David Miller", "Operations", 95542);
		Employee emp4  = new Employee(1004, "Tony Stark", "Engineering", 1765542);
		Employee emp5  = new Employee(1005, "Rohini Sharma", "HR", 35542);
		
		// create list of employee
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		
		// insert 
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(2, emp4);  // insert element at a index
//		listOfEmployee.set(2, emp4);  // replace element at index
		
		System.out.println(listOfEmployee);
		
		//list iteration with iterator
		Iterator<Employee> itr = listOfEmployee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------");
		
		// list iteration with enhanced for loop.
		for(Employee emp : listOfEmployee) {
			System.out.println(emp);
		}
	}

}
