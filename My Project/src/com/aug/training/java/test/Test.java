package com.aug.training.java.test;

import java.util.Scanner;

public class Test {

	private static Scanner Sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of array : ");
		int k =Sc.nextInt();
		int a [] = new int[k];
		for (int i=0;i<k;i++) {
			System.out.println("Enter number : ");
			a[i] = Sc.nextInt();
			
		}
		for (int x=0;x<k;x++){
			System.out.println("Array is "+a[x]);		
		}
		
		
	}
}
