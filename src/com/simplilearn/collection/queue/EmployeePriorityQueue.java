package com.simplilearn.collection.queue;

import java.util.PriorityQueue;

public class EmployeePriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>();
		employeeQueue.add(new Employee(1, "John", "AAA", 24354));
		employeeQueue.add(new Employee(4, "Mike", "BB", 1424354));
		employeeQueue.add(new Employee(2, "William", "AAA", 212334));
		employeeQueue.add(new Employee(3, "Jeet", "BBB", 212334));
		employeeQueue.add(new Employee(5, "Preet", "BBB", 212334));
		employeeQueue.add(new Employee(2, "Nova", "AAA", 212334));
		
		while(true) {
			// return highest priority element from the queue
			Employee employee = employeeQueue.poll();
			System.out.println(employee);
			if(employee == null) break;
		}
		
	}

}
