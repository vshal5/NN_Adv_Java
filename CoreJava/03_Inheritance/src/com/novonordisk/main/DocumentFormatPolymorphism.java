package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.CSV;
import com.novonordisk.domain.DocumentFormat;
import com.novonordisk.domain.PDF;
import com.novonordisk.domain.XLS;

public class DocumentFormatPolymorphism {
	public static void main(String[] args) {

		DocumentFormat documentFormat = null;
		int choice;
		// DocumentFormat documentFormat=new DocumentFormat();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter \n 1. PDF \n 2. XLS \n 3. CSV");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			documentFormat = new PDF();
			break;

		case 2:
			documentFormat = new XLS();
			break;

		case 3:
			documentFormat = new CSV();
			break;

		default:
			// documentFormat.downloadDocument();
			System.out.println("Invalid Choice");
			break;
		}
		documentFormat.downloadDocument();
		System.out.println("Thank you");
	}
}
