package com.aug.training.java.abstractandinterface;

public class Bike extends Vehicle {


	public Bike(){
		super("bike");
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is moving.");

	}

	@Override
	public void breakable() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is breaking.");
	}

}
