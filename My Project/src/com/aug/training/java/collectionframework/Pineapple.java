package com.aug.training.java.collectionframework;

public class Pineapple extends Fruit implements ItfEyes{

	public Pineapple(String name, String color, Size s) {
		super(name, color, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shell() {
		// TODO Auto-generated method stub
		System.out.println("Pineapple has shell.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I really like pineapple.");

	}

	@Override
	public void Eyes() {
		// TODO Auto-generated method stub
		System.out.println("Pineapple has many eyes.");

	}

}
