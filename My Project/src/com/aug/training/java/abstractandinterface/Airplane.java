package com.aug.training.java.abstractandinterface;

public class Airplane extends Vehicle implements ItfFly,ItfFuel {
	
	
	public Airplane(){
		super("airplane");
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
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is flying on the sky.");

	}

	@Override
	public void Fuel() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.vehicle+" is fueling.");

	}


}
