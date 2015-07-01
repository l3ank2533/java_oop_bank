package com.aug.training.java.abstractandinterface;

public class Fish extends Animal implements ItfSwim {
	
	
	public Fish(){
		super("fish");

	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is moving.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" eat Sakura.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is sleeping.");
	
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" can swim.");
	}
	
	
}
