package com.aug.training.java.flow;

import java.util.Scanner;

public class Reverse {
	
	private static Scanner Sc = new Scanner(System.in);
	public static void main(String[] args) {
		String text;
		System.out.print("Text : ");
		text = Sc.nextLine();
		for (int i = text.length()-1 ; i >= 0 ; i--){
			System.out.print(text.charAt(i));
		}
	}

}
