package com.aug.training.java.collectionframework;

import java.util.HashMap;

public class MainFruit {

	public static void main(String[] args) {
		Fruit apple = new Apple("Apple","Green",Size.Medium);
		Fruit durian = new Durian("Durian","Yellow",Size.Large);
		Fruit grape = new Grape("Grape","Purple",Size.Small);
		Fruit pineapple = new Pineapple("Pineapple","Yellow",Size.Large);
		
		HashMap <String,Fruit>map = new HashMap();
		map.put("1", apple);
		map.put("2", durian);
		map.put("3", grape);
		map.put("4", pineapple);
		System.out.println("My fruit :" + map.entrySet());
		
		System.out.println("\n---APPLE---\n");
		map.get("1").eat();
		map.get("1").shell();
		System.out.println("\n---DURIAN---\n");
		map.get("2").eat();
		map.get("2").shell();
		((Durian) map.get("2")).Thorn();		
		System.out.println("\n---GRAPE---\n");
		map.get("3").eat();
		map.get("3").shell();
		((Grape) map.get("3")).Bunch();
		System.out.println("\n---PINEAPPLE---\n");
		map.get("4").eat();
		map.get("4").shell();
		((Pineapple) map.get("4")).Eyes();


	}

}
