package com.novonordisk.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {
	public static void main(String[] args) {
		String path = "C:/Users/Administrator/Desktop/FileIO/User.txt";
		File file = new File(path);
		// declare an array to read file
//		char[] data = new char[50];//commenting to remove empty boxes at output ->*
		char[] data;
		
		try {
			FileReader reader = new FileReader(file);
			int length = (int) file.length();//*
			data = new char[length];//*
			reader.read(data);
			reader.close();
			System.out.println("Read Operation is Completed Successfully");
			// reading using for each loop
			for (char d : data) {
				System.out.print(d);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Invalid File Path");
		} catch (IOException e) {// for
			System.out.println("File IO operation is in Process");
		}
	}
}
