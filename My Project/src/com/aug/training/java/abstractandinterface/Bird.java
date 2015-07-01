package com.aug.training.java.abstractandinterface;
public class Bird extends Animal implements ItfFly {
	

	public Bird(){
		super("bird");

	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is moving.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" eat worm.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is sleeping on the tree.");
	
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" fly on the sky.");

	}


	
}
