package com.aug.training.java.flow;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 1-100 ======");
		int [] num  = new int [100];
		for (int i = 0; i < num.length ; i++) {
			num[i] = i+1 ;
			System.out.print(num[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("======= sum =======");
		int sum = 0 ;
		for (int i = 0; i < num.length ; i++) {
			sum = num[i] + sum ;
		}
			System.out.print("Sum : "+sum);
		
		System.out.println("\n");	
		System.out.println("====== odd number ======");
		for (int i = 0; i < num.length ; i++) {
			
			if (num[i]%2 == 1){
			System.out.print(num[i]+" ");
				
			}
		}
		
		System.out.println("\n");
		System.out.println("====== even number ======");
		for (int i = 0; i < num.length ; i++) {
			
			if (num[i]%2 == 0){
			System.out.print(num[i]+" ");
				
			}
		}
		
		System.out.println("\n");
		System.out.println("========== star ==========");
		System.out.println("");
		System.out.println("== 1 ===");
		System.out.println("");
		for (int i = 1; i <= 10 ; i++) {	
			for (int j = 1; j <= i ;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			}
		System.out.println("");
		System.out.println("== 2 ==");
		System.out.println("");
		for (int i = 1; i <= 10 ; i++) {	
			for (int j = 10; j >= i ;j--){
				System.out.print("*");
			}
			System.out.print("\n");
			}
		System.out.println("");
		System.out.println("== 3 ==");
		System.out.println("");
		for (int i = 1; i <= 10 ; i++) {	
			for (int j = 1; j <= i ;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			}
		for (int i = 1; i <= 10 ; i++) {	
			for (int j = 9; j >= i ;j--){
				System.out.print("*");
			}
			System.out.print("\n");
			}
		
		
		System.out.println("====== prime number ======");
		for (int i = 2; i <= 100; i++) {
	        int j = 2;

	        while (i%j != 0) {
	                j++;
	        }

	        if (j == i) {
	                System.out.print(i + " ");
	        }
		}
		
		
	}

}
