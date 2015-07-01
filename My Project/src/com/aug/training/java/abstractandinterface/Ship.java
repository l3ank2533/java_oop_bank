package com.aug.training.java.abstractandinterface;
public class Ship extends Vehicle implements ItfFloat,ItfFuel {
	

	public Ship(){
		super("ship");
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
	public void Float() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is floating.");

	}

	@Override
	public void Fuel() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is fueling.");

	}


}
