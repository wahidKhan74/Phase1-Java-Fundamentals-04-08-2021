package com.simplilearn.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		
		Employee emp1  = new Employee(1001, "John Smith", "Dev", 8765542);
		Employee emp2  = new Employee(1002, "Marry Smith", "Finance",65542);
		Employee emp3  = new Employee(1003, "David Miller", "Operations", 95542);
		Employee emp4  = new Employee(1004, "Tony Stark", "Engineering", 1765542);
		Employee emp5  = new Employee(1005, "Rohini Sharma", "HR", 35542);
		
		// create set of employee
		Set<Employee> employees = new HashSet<Employee>();
		
		// insert 
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4); 
		
		System.out.println(employees);
		
		//set iteration with iterator
		Iterator<Employee> itr = employees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------");
		
		// set iteration with enhanced for loop.
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
