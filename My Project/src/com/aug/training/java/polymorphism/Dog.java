package com.aug.training.java.polymorphism;

public class Dog extends Animal implements ItfBark {
	
	public Dog(){
		super("dog");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is moving.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" eat the Pedigree.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is sleeping.");
	
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("The "+super.animal +" is barking.");

	}
	public void ability(){
		this.bark();
	}

	
	
	
	
}
