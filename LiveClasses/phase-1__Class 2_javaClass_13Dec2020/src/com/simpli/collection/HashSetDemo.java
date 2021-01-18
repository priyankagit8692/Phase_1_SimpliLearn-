package com.simpli.collection;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
		cities.add("Chennai");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Ahmeda");
		cities.add("Chennai");
		cities.add(null);
		cities.add(null);
		System.out.println(cities);
	}
}
