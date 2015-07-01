package com.aug.training.java.enumsandexception;

public enum Day {Sunday("Red"),Monday("Yellow"),Tuesday("Pink"),Wednesday("Green"),
	Thursday("Orange"),Friday("Blue"),Saturday("Purple");
	
	public String color;
	
	Day (String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
	

