package com.aug.training.java.homework;

import java.util.Scanner;

public class Calculator {

	private static Scanner Sc = new Scanner(System.in);
	
	public static void plus(int a,int b) {
		int x;
		x = a + b;
		System.out.println("### Total : "+x);

	}
	
	public static void minus(int a,int b) {
		int x;
		x = a - b;
		System.out.println("### Total : "+x);

	}
	public static void multiply(int a,int b) {
		int x;
		x= a * b;
		System.out.println("### Total : "+x);
	}
	public static void divide(int a,int b) {
		int x;
		x= a / b;
		System.out.println("### Total : "+x);
	}
	
	public static void main(String[] args) {
		int a,b,c=0;
		while(true){
		 System.out.println("Select 1 choice : ");
		 System.out.println("1 for + ");
         System.out.println("2 for - ");
         System.out.println("3 for * ");
   	     System.out.println("4 for / ");
   	     System.out.println("5 for exit ");
		 System.out.println("You choose :");
		 c = Sc.nextInt();
		 if (c==5) {
			 break;
		 }
		 System.out.print("First num : ");
	     a = Sc.nextInt();
	     System.out.print("Second num : ");
	     b = Sc.nextInt();
	     if (c==1) {
	    	 plus(a,b);
	     } else if (c==2) {
	    	 minus(a,b);	 
	     } else if (c==3) {
	    	 multiply(a, b);
	     } else if (c==4) {
	    	 if (b==0){
	    		 System.out.println("--- Can not divide by 0 ---");
	    	 } else { 
	    		 divide(a, b);
	    	 }
	    	 
	     } else {
	    	 System.out.println("Please select again !");
	     }
		}
		
	   



	    
	}
}
