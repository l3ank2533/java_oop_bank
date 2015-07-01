package com.aug.training.java.polymorphism;


public class Main {

	public static void main (String args[]) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();

		Person person1 = new Person(cat);
		Person person2 = new Person(dog);
		
		System.out.println("Person1 has : ");
		person1.show();
		
		
		System.out.println("Person2 has : ");
		person2.show();
	
		

	}
}
