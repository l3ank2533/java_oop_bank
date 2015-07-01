package com.aug.training.java.enumsandexception;

import java.util.Scanner;

public class CheckingAccount {
	
	private static double balance = 10000;
	
	private static Scanner Sc = new Scanner(System.in);

		public static void main (String args[]) throws InsufficentFundException {
		
			int choice , i ;
			 while(true){
				System.out.println("\n--- Please select 1 choice ---");
				System.out.println("Press 1 : Deposit");
				System.out.println("Press 2 : Withdraw");
				System.out.println("Press 3 : Check Balance");
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
						throw new InsufficentFundException("Can not withdraw : your money is not enough");
					}
					
				} else if (choice==3) {
					balance();
				
				} else
					System.out.println("...Please select again !...\n");
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


