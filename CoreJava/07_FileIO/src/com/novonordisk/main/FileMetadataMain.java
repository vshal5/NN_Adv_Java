package com.novonordisk.main;

import java.io.File;
public class FileMetadataMain {

	public static void main(String[] args) {
		String path = "C:/Users/Administrator/Desktop/FileIO/User.txt";
		File file = new File(path);
		if (file.exists()) {
			System.out.println("File Name :: " + file.getName());
			System.out.println("File Path :: " + file.getAbsolutePath());
			System.out.println("File size :: " + file.length() + " bytes");
			System.out.println("Last Modified :: " + file.lastModified());

		} else {
			System.out.println("Invalid File Path");
		}
	}
}
