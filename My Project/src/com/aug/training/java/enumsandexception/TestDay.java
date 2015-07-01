package com.aug.training.java.enumsandexception;

public class TestDay {
	public static void main(String[] args) {
		
		Day day = Day.Friday;
		switch(day){
		case Sunday    : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Monday    : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Tuesday   : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Wednesday : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Thursday  : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Friday    : System.out.println(day+"\tColor of day is "+day.color); break ;
		case Saturday  : System.out.println(day+"\tColor of day is "+day.color); break ;

		}
		
		
		/*
		if (day.equals("Sunday")){
			System.out.println("Color of day is : "+day.color);
		}
		else if (day.equals("Monday")) {
			System.out.println("Color of day is : "+day.color);
		}
		else if (day.equals("Tuesday")){
			System.out.println("Color of day is : "+day.color);
		}
		else if (day.equals("Wednesday")){
			System.out.println("Color of day is : "+day.color);
		}
		else if (day.equals("Thurday")){
			System.out.println("Color of day is : "+day.color);
		}
		else if (day.equals("Friday")){
			System.out.println("Color of day is : "+day.color);
		}
		else  {
			System.out.println("Color of day is : "+day.color);
	}
	*/
		
	}
}
