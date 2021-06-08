package com.simplilearn.exception.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		
		File file = createFile("user.txt");
		writeFile(file,"Test file data !");
		
		System.out.println("-----------");
		createAndWriteFile("sample.txt","Today is a good day!");
	}

	private static File createFile(String path) {
		File file = new File(path);
		try {
			if(file.createNewFile()) {
				System.out.println("File is created !");
			} else {
				System.out.println("File already exist !");
			}
		} catch (IOException e) {
			System.out.println("File creation failed !");
		}
		return file;
	}
	
	// Write data as char stream
	private static void writeFile(File file, String data) {
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write(data);
			System.out.println("File Write operation completed !");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("File Write operation failed !");
		}		
	}
	
	// Write data as byte stream
	private static void createAndWriteFile(String path, String data) {
		
		try {
			FileOutputStream out = new FileOutputStream(path,true);
			out.write(data.getBytes());
			System.out.println("File Write operation completed !");
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File operation failed !");
		} catch (IOException e) {
			System.out.println("File Write operation failed !");
		}
	}
}
