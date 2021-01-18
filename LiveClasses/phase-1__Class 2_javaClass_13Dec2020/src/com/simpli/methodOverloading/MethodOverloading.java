package com.simpli.methodOverloading;
public class MethodOverloading {

	private static int sum(int a,int b) {
		int c = a+b;
		return c;	
	}

	private void area(int length,int width) {
		System.out.println("Rectangle area:"+length*width);
	}
	
	public void area(int radius) {
		System.out.println("Circle area:"+Math.PI*radius*radius);
	}
	 void area(double side) {
		System.out.println("Square area:"+side*side);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.area(2.0);
		mo.area(23);
		mo.area(2,3);
	}
}
