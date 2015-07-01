package com.aug.training.java.collectionframework;

import java.util.HashMap;

public class Student {
	protected String id;
	protected String name;
	protected String degree;
	protected Address address;
	protected HashMap<Integer,Course> course = new HashMap<Integer,Course>();
	
	public Student(String id,String name,String degree,Address address) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.address = address;
		
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Course getCourse(int key) {
		return this.course.get(key);
	}

	public void setCourse(HashMap<Integer, Course> course) {
		this.course = course;
	}
	public void addCourse(Course course){
		this.course.put(this.course.size(), course);
	}
	
}
