package com.aug.training.java.homework;

import java.util.Scanner;

public class ATM {
	private static String uname = "user";
	private static String pass = "pass";
	private static double balance = 8000;
	
	private static Scanner Sc = new Scanner(System.in);

		public static void main (String args[]) {
			String inputname , inputpass;
			int choice , i ;
			boolean login = true;
			while(login){	
			System.out.println("--- Please login ---");
			System.out.print("Username : ");
			inputname=Sc.nextLine();
			System.out.print("Password : ");
			inputpass=Sc.nextLine();
			if (uname.equals(inputname) && pass.equals(inputpass)){
				System.out.println("+++ Login Success ! +++");
				while(true) {
				System.out.println("\n--- Please select 1 choice ---");
				System.out.println("Press 1 : Deposit");
				System.out.println("Press 2 : Withdraw");
				System.out.println("Press 3 : Check balance");
				System.out.println("Press 4 : Log out");
				System.out.print("You select : ");
				choice =Sc.nextInt();
				if (choice==1){
					System.out.println("Input your money : ");
					i = Sc.nextInt();
					deposit(balance,i);
					
				} else if (choice==2) {
					System.out.println("Input your money : ");
					i = Sc.nextInt();
					if (balance >= i){
						withdraw(balance,i);
					} else {
						System.out.println("Can not withdarw !");
					}
					
				} else if (choice==3) {
					balance();
				} else if (choice==4) {
					System.out.println("+++ Log out success ! +++");
					login = false;
					break;
				
				} else
					System.out.println("...Please select again !...");
					}
			}
			else {
				System.out.println("+++ Login again : user or password is wrong ! +++\n");

			}
			}

		}
		public static void deposit(double a,double b) {
			
			balance = a + b;
			System.out.println("### Balance : "+balance);

		}
		public static void withdraw(double a,double b) {
			
			balance = a - b;
			System.out.println("### Balance : "+balance);

		}
		public static void balance() {
			System.out.println("### Balance : "+balance);

		}
}
