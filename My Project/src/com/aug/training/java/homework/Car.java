package com.aug.training.java.homework;

public class Car {
	private String color = "White";
	private String brand = "Honda" ;
	private int wheel = 4 ;
	private boolean breakable = true;
	private boolean fuel = true;
	
	public Car(){
		
	}
	
	public Car(String color, String brand) {
		this.color = color;
		this.brand = brand;
	
	}
	
	public void start(){
		System.out.println("Car is starting.");
	}
	public void stop(){
		System.out.println("Car is stoping.");
	}
	public void fuel(){
		System.out.println("Fuel fill.");
	}
	

	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", wheel=" + wheel
				+ ", breakable=" + breakable + ", fuel=" + fuel + "]";
	}

	public static void main (String args[]) {
		Car car = new Car();
		Car car2 = new Car("Red","Toyota");
		
		System.out.println(car.toString());
		car.start();
		car.stop();
		car.fuel();
		
		System.out.println(car2.toString());
		car2.start();
		car2.stop();
		car2.fuel();
		
		
	}
}
