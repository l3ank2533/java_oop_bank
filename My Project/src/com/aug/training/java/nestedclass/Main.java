package com.aug.training.java.nestedclass;

public class Main {

	public static void main(String[] args) {
		// static
		OuterStatic.InnerStatic instance1 = new OuterStatic.InnerStatic();
		instance1.print();
		
		OuterStatic.print();
		
		// non static
		OuterNonStatic instance2 = new OuterNonStatic() ;
		OuterNonStatic.InnerNonStatic a = instance2.new InnerNonStatic ();
		a.print();
		
		instance2.print();
		
		// anonymous
		Anonymous b = new Anonymous(){
			public void print(){
				System.out.println("\nAnonymous");
			}
		} ;
		b.print();
		
		// interface
		MyInterrface c = new MyInterrface() {
	
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("My anonymouus interface");
			}
		};
		c.print();
	}

}
