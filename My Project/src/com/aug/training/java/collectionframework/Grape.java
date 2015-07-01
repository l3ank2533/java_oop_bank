package com.aug.training.java.collectionframework;

public class Grape extends Fruit implements ItfBunch{

	public Grape(String name, String color, Size s) {
		super(name, color, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shell() {
		// TODO Auto-generated method stub
		System.out.println("Grape has shell.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am eating grape.");

	}

	@Override
	public void Bunch() {
		// TODO Auto-generated method stub
		System.out.println("I will going to buy a bunch of grape.");

	}

}
