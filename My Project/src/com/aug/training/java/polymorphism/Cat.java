package com.aug.training.java.polymorphism;

public class Cat extends Animal implements ItfScratch {

	public Cat(){
		super("cat");

	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is moving.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" eat the royal canin.");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is sleeping.");

	}

	@Override
	public void scratch() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is scratching.");

	}

	 @Override
	 public void ability() {
		// TODO Auto-generated method stub
		this.scratch();
	} 

}
