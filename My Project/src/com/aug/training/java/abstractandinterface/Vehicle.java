package com.aug.training.java.abstractandinterface;

public abstract class Vehicle {
	
	protected String vehicle;
	public Vehicle(){
		
	}
	public Vehicle(String vahicle){
		this.vehicle = vahicle;
	}
	public abstract void move();
	public abstract void breakable();
	
}


