package com.aug.training.java.nestedclass;

public class OuterNonStatic {

	String text = "Outter non static";
	public  void print(){
		System.out.print("\nText is : "+text);
	}
	
	public class InnerNonStatic {
		String text ="inner non static";
		public void print(){
			System.out.print("\nText is : "+text);
		}
		
	}
	
	
}