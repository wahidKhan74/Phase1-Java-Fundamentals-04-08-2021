package com.simplilearn.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		// 1. create object
		Employee employee = new Employee(10002, "Mike Smith", "Engineering", 788734);
		
		// 2. create byte streams
		try {
			//create file output stream
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object
			out.writeObject(employee);
			
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
