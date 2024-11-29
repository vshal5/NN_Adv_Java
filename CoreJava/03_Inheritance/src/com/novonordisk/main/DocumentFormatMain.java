package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.CSV;
import com.novonordisk.domain.DocumentFormat;
import com.novonordisk.domain.PDF;
import com.novonordisk.domain.XLS;

public class DocumentFormatMain {
	public static void main(String[] args) {
		
		int choice;
		String continueChoice;
		
		//DocumentFormat documentFormat=new DocumentFormat();
	
		Scanner scanner = new Scanner(System.in);	
		do {
			System.out.println("Enter \n 1. PDF \n 2. XLS \n 3. CSV");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				PDF pdf = new PDF();
				pdf.downloadDocument();
				break;
				
			case 2:
				XLS xls = new XLS();
				xls.downloadDocument();
				break;
				
			case 3:
				CSV csv = new CSV();
				csv.downloadDocument();
				break;
				
			default:
			//	documentFormat.downloadDocument();
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue? y || n");
			continueChoice = scanner.next();
		}while(continueChoice.equals("y"));
		System.out.println("Thank you");
		//scanner.close(); it will not work if i give n
	}
}
