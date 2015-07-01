package com.aug.training.java.flow;

public class Sortby {

	public static void main(String[] args) {
		int[] number = {9,8,7,1,2,3,5,4};
		
		int min ,pos;
		for(int i =0; i<8; i++){
			min = number[i];
			pos = i;
			for(int j=i+1; j<8;j++){
				if(number[j]<min){
					min = number[j];
					pos = j;
				}
			}//end j
			number[pos] = number[i];
			number[i]=min;
		}//end i
		for(int i = 0; i<8; i++){
			System.out.print(number[i]+" ");
		}
		
	}

}
