package com.aug.training.java.collectionframework;

import java.util.TreeSet;
import java.util.Iterator;

public class MyTreeSet {
	
	public static void main(String args[ ]) {
	
		TreeSet tree = new TreeSet();
				
		tree.add("Rat");
		tree.add("Rabbit");
		tree.add("Cat");
		tree.add("Dog");
		tree.add("Dog");

		
		Iterator iterator = tree.iterator( );
		
		while(iterator.hasNext( )) {
		   System.out.println(iterator.next( ).toString( ));
		}
	}		
}
