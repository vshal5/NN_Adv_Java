package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.NumberUtil;

public class getLargestMain {
	public static void main(String[] args) {
		
		//dec and Init
		int n1, n2, n3;
		
		//take values
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter n1");
		n1 = scanner.nextInt();
		System.out.println("Enter n2");
		n2 = scanner.nextInt();
		System.out.println("Enter n3");
		n3 = scanner.nextInt();
		
		NumberUtil getlargeObj = new NumberUtil();
		int large=getlargeObj.getLargest(n1, n2, n3);
		
		System.out.println("largest Number " + large);		
	}
}
