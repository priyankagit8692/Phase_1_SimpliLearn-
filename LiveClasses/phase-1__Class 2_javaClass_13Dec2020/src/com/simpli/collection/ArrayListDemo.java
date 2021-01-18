package com.simpli.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList();
		cities.add("Chennai");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Ahmeda");
		cities.add("Chennai");
		System.out.println(cities);
		cities.remove(1);
		System.out.println(cities);
		System.out.println(cities.size());
		cities.set(1, "Pune");
		System.out.println(cities);
		System.out.println(cities.indexOf("Pune"));
		//cities.clear();
		System.out.println(cities.get(3));
		Collections.sort(cities);
		System.out.println(cities);
		System.out.println("Using for each loop:");
		for(String city :cities) {
			System.out.println(city);
		}

		System.out.println("Using iterator:");
		Iterator<String> iterator = cities.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() );
		}
	}

}
