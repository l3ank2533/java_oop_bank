package com.aug.training.java.collectionframework;

public abstract class Fruit {
	
	public Fruit(String name,String color,Size size){
		this.name = name;
		this.color = color;
		this.size = size;
	}
	protected String name;
	protected String color;
	protected Size size;
	
	@Override
	public String toString() {
		return "" + name + ", Color=" + color + ", Size=" + size + "";
	}
	public abstract void shell();
	
	public abstract void eat();

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Size getS() {
		return size;
	}
	public void setS(Size size) {
		this.size = size;
	}


	
}
