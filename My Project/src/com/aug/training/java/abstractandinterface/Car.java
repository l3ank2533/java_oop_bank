package com.aug.training.java.abstractandinterface;

public class Car extends Vehicle implements ItfFuel {

	public Car(){
		super("car");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is moving on the road.");
	}

	@Override
	public void breakable() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is breaking.");
	}

	@Override
	public void Fuel() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is fueling.");

	}


}
