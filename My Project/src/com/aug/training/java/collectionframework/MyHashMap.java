package com.aug.training.java.collectionframework;

import java.util.HashMap;;

public class MyHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap ();
		map.put("greeting", "Hello");
		map.put("nickname", "Proton");
		map.put("name", "Chalisa");
		map.remove("greeting"); //remove map("greeting") that is delete Hello
		System.out.println("My nickname is " + map.get("nickname"));
		System.out.println("Key of the map is " + map.keySet());
		System.out.println("Content in the map are : " + map.entrySet());
		
	}
}
