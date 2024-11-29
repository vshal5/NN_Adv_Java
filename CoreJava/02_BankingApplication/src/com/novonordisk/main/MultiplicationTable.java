package com.novonordisk.main;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int num,i=1;
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find its multiplication Tables");
		num = scanner.nextInt();
		
		//for(i=1;i<=10;i++){
		while(i<=10) {
			System.out.println(num + " * "+ i +" = "+ i*i );
			i++;
		}
	}
}
