package com.aug.training.java.collectionframework;

public class Durian extends Fruit implements ItfThorn{

	public Durian(String name, String color, Size s) {
		super(name, color, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shell() {
		// TODO Auto-generated method stub
		System.out.println("Durian has thick shell.");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I like to eat durian.");

	}

	@Override
	public void Thorn() {
		// TODO Auto-generated method stub
		System.out.println("Durian has many thorn.");

	}

}
