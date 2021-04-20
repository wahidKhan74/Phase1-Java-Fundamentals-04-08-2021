package com.simplilearn.collection.set;

public class Employee {
	
	//Properties
	public int id;
	public String name;
	public String dept;
	public float salary;
	
	public Employee(int id, String name, String dept, float salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
