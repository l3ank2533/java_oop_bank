package com.aug.training.java.abstractandinterface;

public abstract class Animal {
		
	protected String animal;
	public Animal(){
		
	}
	public Animal(String animal){
		this.animal = animal;
	}
		public abstract void move();
		public abstract void eat();
		public abstract void sleep();
	}

