package com.aug.training.java.collectionframework;

import java.util.HashMap;

public class Teacher {
	protected String id;
	protected String name;
	protected HashMap<Integer,Address> address = new HashMap<Integer,Address>();
	protected HashMap<Integer,Course> course = new HashMap<Integer,Course>();
	
	public Teacher(String id,String name){
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAdress(Address address){
		this.address.put(this.address.size(), address);
	}
	public void addCourse(Course course){
		this.course.put(this.course.size(), course);
	}
	
}
