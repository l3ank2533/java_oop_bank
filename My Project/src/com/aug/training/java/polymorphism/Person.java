package com.aug.training.java.polymorphism;

public class Person {
	Animal animal = null;
	
	private Person(){
		
	}
	public Person(Animal animal){
		this.animal=animal;
	}

	public void show(){
		animal.move();
		animal.eat();
		animal.sleep();
		animal.ability();
		
	}
}
