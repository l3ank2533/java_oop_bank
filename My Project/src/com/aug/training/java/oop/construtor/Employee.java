package com.aug.training.java.oop.construtor;

public class Employee {
	
	private int id = 1;
	private String name = "Chalisa";
	private String lastname = "Patanadamrongchai";
	private String position = "Consult";
	
	public Employee(){
		System.out.println("ID : "+id + "\tName : "+name +"\tLastname : "+lastname +"\tPosition : "+position);
	}
	
	public Employee(int id1,String name1,String lastname1,String position1){
		this.id = id1;
		this.name = name1;
		this.lastname = lastname1;
		this.position = position1;
		
	}
	//method
	public void printemp(){
		System.out.println("ID : "+id + "\tName : "+name +"\tLastname : "+lastname +"\tPosition : "+position);
	}
	
	public String getName(){
		return this.name;
	}
	 
	public static void main (String args[]) {
		Employee emp = new Employee();
		Employee emp2 = new Employee(3,"Proton","Proton","consult");
		emp2.printemp();
		System.out.println(emp.getName());
	
	}
}

