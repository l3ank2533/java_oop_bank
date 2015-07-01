package com.aug.training.java.abstractandinterface;

public class Insect extends Animal implements ItfLeg {
	
	public Insect(){
		super("insect");
	}


	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is moving.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal + " like to eat leaf.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is sleeping.");
	
	}

	@Override
	public void leg() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" has 6 legs.");

	}

	
	
	
}
