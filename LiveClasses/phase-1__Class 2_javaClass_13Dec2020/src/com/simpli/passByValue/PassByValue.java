package com.simpli.passByValue;

public class PassByValue {
	
	int value = 100;
	private static int changeValue(int a) {
		a = a + 100;
		return a;
	}
	
	private int changingValue(int a) {
		a = a+100;
		this.value = a;
		return a;
	}
	
	public static void main(String[] args) {
		PassByValue valueObj = new PassByValue();
		System.out.println("Before calling method Overloading:"+valueObj.value);
		PassByValue.changeValue(valueObj.value);
		System.out.println("After calling method Overloading:"+valueObj.value);
		System.out.println("Before calling method Overloading:"+valueObj.value);
		valueObj.changingValue(valueObj.value);
		System.out.println("After calling method Overloading:"+valueObj.value);

	}

}
