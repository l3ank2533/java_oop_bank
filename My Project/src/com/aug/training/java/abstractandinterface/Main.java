package com.aug.training.java.abstractandinterface;


public class Main {

	
	public static void main (String args[]) {
		System.out.println("=== Animal ===\n");
		System.out.println("--- Dog ---\n");
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		dog.move();
		dog.sleep();
		System.out.println("\n--- Fish ---\n");
		Fish fish = new Fish();
		fish.eat();
		fish.move();
		fish.sleep();
		fish.swim();
		System.out.println("\n--- Bird ---\n");
		Bird bird = new Bird();
		bird.eat();
		bird.move();
		bird.sleep();
		bird.fly();
		System.out.println("\n--- Insect ---\n");
		Insect insect = new Insect();
		insect.eat();
		insect.move();
		insect.sleep();
		insect.leg();
		System.out.println("\n=== Vehicle ===\n");
		System.out.println("--- Car ---\n");
		Car car = new Car();
		car.move();
		car.breakable();
		car.Fuel();
		System.out.println("\n--- Airplane ---\n");
		Airplane airplane = new Airplane();
		airplane.move();
		airplane.breakable();
		airplane.Fuel();
		airplane.fly();
		System.out.println("\n--- Ship ---\n");
		Ship ship = new Ship();
		ship.move();
		ship.breakable();
		ship.Fuel();
		ship.Float();
		System.out.println("\n--- Motorcycle ---\n");
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.move();
		motorcycle.breakable();
		motorcycle.Fuel();
		System.out.println("\n--- Bike ---\n");
		Bike bike = new Bike();
		bike.move();
		bike.breakable();
		
		

	}
}
