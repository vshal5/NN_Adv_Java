package com.novonordisk.main;

public class Array {
	public static void main(String[] args) {
		int [] number = new int[5];
		
		number[0]=1;
		number[1]=3234;
		number[3]=24;
		number[2]=22;
		number[4]=131;
		/*
		 * for(int i=0;i<number.length;i++) { System.out.println(number[i]); }
		 */
		//for each loop for array & collection only
		for(int i: number) {
			System.out.println(i);
		}
		
	}
}
