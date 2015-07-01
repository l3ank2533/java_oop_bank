package com.aug.training.java.polymorphism;

public abstract class Animal {
	
	protected String animal = null;
	public Animal(){
		
	}
	public Animal(String animal){
		this.animal = animal;
	}
	
	public abstract void move();
	public abstract void eat();
	public abstract void sleep();
	public abstract void ability();

	}

