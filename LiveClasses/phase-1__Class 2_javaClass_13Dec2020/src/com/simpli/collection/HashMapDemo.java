package com.simpli.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> sMap = new HashMap();
		Student s1 = new Student(1,"Priyanka");
		Student s2 = new Student(2,"Divya");
		sMap.put(1, s1);
		sMap.put(2,s2);
		sMap.put(null,s1);
		System.out.println(sMap);
		Set<Entry<Integer,Student>> enteries = sMap.entrySet();
		for(Entry entry : enteries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		

	}

}
