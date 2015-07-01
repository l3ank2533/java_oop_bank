package com.aug.training.java.collectionframework;

import java.util.HashMap;
import java.util.Iterator;

public class MainCourse {
	
	public static void main(String[] args) {
		Address add1 = new Address("99/9","AAA Rd","Muang","Phitsanulok","65000");
		Address add2 = new Address("11/2","BBB Rd","Muang","CM","51000");
		Address add3 = new Address("33","CCC Rd","Muang","BKK","12110");
		Address add4 = new Address("56/2","DDD Rd","Muang","BKK","10270");
		Address add5 = new Address("12/3","EEE Rd","Muang","BKK","10290");

		Student stu1 = new Student("0001", "Proton","m.6",add1);
		Student stu2 = new Student("0002", "Bank", "m.6",add2);
		
		Teacher tea1 = new Teacher("0001", "Ann");
		Teacher tea2 = new Teacher("0002", "Jib");
		
		Course[]course = new Course[4];
		course[0] = new Course("12131","Basic Java",tea1);
		course[1] = new Course("23101","Computer Programming",tea1);
		course[2] = new Course("32121","Mathematic",tea2);
		course[3] = new Course("101231","Science",tea2); 

		
		
		System.out.println("\n---Teacher 1---\n");
		System.out.println("ID : "+tea1.id);
		System.out.println("Name : "+tea1.name);
		tea1.addAdress(add3);
		System.out.println("Address : "+tea1.address.get(0).getAddress()+
							" "+tea1.address.get(0).getStreet()+
							" "+tea1.address.get(0).getDistrict()+
							" "+tea1.address.get(0).getProvince()+
							" "+tea1.address.get(0).getZipcode());
		tea1.addCourse(course[0]);
		tea1.addCourse(course[1]);
		System.out.println("Course : "+tea1.course.get(0).getId()+
							" "+tea1.course.get(0).getName());
		System.out.println("Course : "+tea1.course.get(1).getId()+
							" "+tea1.course.get(1).getName());
		
		
		System.out.println("\n---Teacher 2---\n");
		System.out.println("ID : "+tea2.id);
		System.out.println("Name : "+tea2.name);
		tea2.addAdress(add4);
		tea2.addAdress(add5);
		System.out.println("Address : "+tea2.address.get(0).getAddress()+
							" "+tea2.address.get(0).getStreet()+
							" "+tea2.address.get(0).getDistrict()+
							" "+tea2.address.get(0).getProvince()+
							" "+tea2.address.get(0).getZipcode());
		System.out.println("Address : "+tea2.address.get(1).getAddress()+
							" "+tea2.address.get(1).getStreet()+
							" "+tea2.address.get(1).getDistrict()+
							" "+tea2.address.get(1).getProvince()+
							" "+tea2.address.get(1).getZipcode());
		tea2.addCourse(course[2]);
		tea2.addCourse(course[3]);
		System.out.println("Course : "+tea2.course.get(0).getId()+
							" "+tea2.course.get(0).getName());
		System.out.println("Course : "+tea2.course.get(1).getId()+
							" "+tea2.course.get(1).getName());

		System.out.println("\n---Student 1---\n");
		System.out.println("ID : "+stu1.id);
		System.out.println("Name : "+stu1.name);
		System.out.println("Degree : "+stu1.degree);
		System.out.println("Address : "+stu1.getAddress().address+
							" "+stu1.getAddress().street+
							" "+stu1.getAddress().district+
							" "+stu1.getAddress().province+
							" "+stu1.getAddress().zipcode
							);
		stu1.addCourse(course[0]);
		stu1.addCourse(course[1]);
		stu1.addCourse(course[2]);
		System.out.println("Course : "+stu1.getCourse(0).getId()+
							" "+stu1.getCourse(0).getName());
		System.out.println("Course : "+stu1.getCourse(1).getId()+
							" "+stu1.getCourse(1).getName());
		System.out.println("Course : "+stu1.getCourse(2).getId()+
							" "+stu1.getCourse(2).getName());

		System.out.println("\n---Student 2---\n");
		System.out.println("ID : "+stu2.id);
		System.out.println("Name : "+stu2.name);
		System.out.println("Degree : "+stu2.degree);
		System.out.println("Address : "+stu2.getAddress().address+
							" "+stu2.getAddress().street+
							" "+stu2.getAddress().district+
							" "+stu2.getAddress().province+
							" "+stu2.getAddress().zipcode
							);
		stu2.addCourse(course[0]);
		stu2.addCourse(course[2]);
		stu2.addCourse(course[3]);
		System.out.println("Course : "+stu2.getCourse(0).getId()+
							" "+stu2.getCourse(0).getName());
		System.out.println("Course : "+stu2.getCourse(1).getId()+
							" "+stu2.getCourse(1).getName());
		System.out.println("Course : "+stu2.getCourse(2).getId()+
							" "+stu2.getCourse(2).getName());

		System.out.println("\n---Course---\n");
		for (int i = 0; i < course.length ;i++){
			System.out.println("Teacher : "+course[i].getTeacher());
			System.out.println("ID : "+course[i].getId());
			System.out.println("Course name : "+course[i].getName());
			System.out.println("\n");

		}
		
		/*System.out.println("\n---Course---\n");
		Iterator iterator = HashMap.iterator( );
		while(iterator.hasNext()) {
			   System.out.println(iterator.next( ).toString( ));
		}
		System.out.println("Teacher : "+tea1.course.getTeacher());
		System.out.println("ID : "+course.getId());
		System.out.println("Course name : "+course.getName());
		*/ 
				


	}
}
