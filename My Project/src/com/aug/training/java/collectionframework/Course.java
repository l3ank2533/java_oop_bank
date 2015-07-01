package com.aug.training.java.collectionframework;


public class Course {
	protected String id;
	protected String name;
	protected Teacher teacher;
	
	public Course(String id,String name,Teacher teacher){
		this.id = id;
		this.name = name;
		this.teacher = teacher;
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

	public String getTeacher() {
		return teacher.name;
	}

	public void setTeacher(String teacher) {
		this.teacher.setName(id); 
	}
}
