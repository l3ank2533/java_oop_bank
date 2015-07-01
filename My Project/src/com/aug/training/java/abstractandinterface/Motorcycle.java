package com.aug.training.java.abstractandinterface;

public class Motorcycle extends Vehicle implements ItfFuel {

	
	public Motorcycle(){
		super("motorcycle");
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
	@Override
	public void Fuel() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is fueling.");
 
	}

}
