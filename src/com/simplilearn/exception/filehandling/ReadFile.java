package com.simplilearn.exception.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		readFile("sample.txt");

	}

	private static void readFile(String pathname) {
		
		try {
			FileInputStream fileIn = new FileInputStream(pathname);
			int i=0;
			while((i=fileIn.read()) != -1) {
				System.out.print((char)i);
			}
			fileIn.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found operation failed !");
		} catch (IOException e) {
			System.out.println("File read operation failed !");
		}
		
	}

}
