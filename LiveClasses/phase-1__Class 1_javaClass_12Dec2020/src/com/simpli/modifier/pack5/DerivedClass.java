package com.simpli.modifier.pack5;

import com.simpli.modifier.pack4.BaseClass;

public class DerivedClass extends BaseClass {

	public static void main(String[] args) {
		DerivedClass class1 = new DerivedClass();
		int x = class1.display();
		System.out.println(class1.i);
	}
}
