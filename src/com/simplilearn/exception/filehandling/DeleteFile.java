package com.simplilearn.exception.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) {
		
		try {
			Files.delete(Paths.get("user.txt"));
			System.out.println("File is deleted !");
		} catch (IOException e) {
			System.out.println("File not found");
		}

	}
	

}
