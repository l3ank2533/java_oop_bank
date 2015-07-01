package com.aug.training.java.exercise;

public class DeclaringArray {
	public static void main (String args[]) {
	int [] exAr = new int[5];
	int [] exAr2 = {1,2,3,4,5};
	exAr[0] = 1;
	exAr[1] = 2;
	exAr[2] = 3;
	exAr[3] = 4;
	exAr[4] = 5;
	System.out.println("Array 1 : "+exAr[0]);
	System.out.println("Array 2 : "+exAr[1]);
	System.out.println("Array 3 : "+exAr[2]);
	System.out.println("Array 4 : "+exAr[3]);
	System.out.println("Array 5 : "+exAr[4]);
	System.out.println("\n");
	for (int i=0 ; i<exAr2.length ; i++){
		System.out.println("Array : " + exAr2[i]);

	}
	
	}

}
