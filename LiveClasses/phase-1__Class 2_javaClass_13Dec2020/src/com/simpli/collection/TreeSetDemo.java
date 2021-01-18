package com.simpli.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> cities = new TreeSet<String>();
		cities.add("Chennai");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Ahmeda");
		cities.add("Chennai");
		cities.add(null);
		//cities.add(null);
		System.out.println(cities);
	}

}
