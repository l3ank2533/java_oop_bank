package com.aug.training.java.flow;
import java.util.Scanner;
public class Equaltext {

		private static Scanner Sc = new Scanner(System.in);
		public static void main (String args[]) {
			String First,Second;
			
			System.out.print("First : ");
		    First = Sc.nextLine();
		    System.out.print("Second : ");
		    Second = Sc.nextLine();
		    
		    if (First.equals(Second)) {
		    	System.out.println("True");
		    } else {
		    	System.out.println("false");
		    }
		  
		
		}
	}
