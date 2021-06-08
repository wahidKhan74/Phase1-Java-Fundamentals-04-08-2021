package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		// 1. read file
		try {
			// create file input stream
			FileInputStream file = new FileInputStream("file-db.txt");
			
			//create object input stream
			ObjectInputStream in = new ObjectInputStream(file);
			
			// 2. method deserialized object
			Employee employee = (Employee) in.readObject();
			
			System.out.println("Show Deserialized Object Employee");
			System.out.println("Emp Id : "+ employee.id);
			System.out.println("Emp Name : "+ employee.name);
			System.out.println("Emp Dept : "+ employee.dept);
			System.out.println("Emp Salary : "+ employee.salary);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
