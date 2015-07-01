package com.aug.training.java.collectionframework;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedlist {
	public static void main(String[] args) {

	List <Integer>list = new LinkedList ();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(4);

	System.out.println("Size is " + list.size());
	System.out.println("The Content are : " + list);
	System.out.println("The first is " + list.get(0));
	System.out.println("The second is " + list.get(1));
	list.remove(0); // remove list(0) that is delete 1
	System.out.println("Index of 1 is " + list.indexOf(1));
	
	Object array[ ] = list.toArray( );
	System.out.println("---Loop--- ");

	for(int x=0; x<array.length; x++) {
	   System.out.println(array[x]);
	}

	}
}
