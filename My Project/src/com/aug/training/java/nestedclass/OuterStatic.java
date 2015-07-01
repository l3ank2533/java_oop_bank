package com.aug.training.java.nestedclass;

public class OuterStatic {
	
	static String text = "Outter static";
	public static void print(){
		System.out.print("\nText is : "+text);
	}
	
	public static class InnerStatic {
		String text ="inner static";
		public void print(){
			System.out.print("Text is : "+text);
		}
		
	}
	
	
}
