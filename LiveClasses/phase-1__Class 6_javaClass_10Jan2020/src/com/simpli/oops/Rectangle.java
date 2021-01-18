package com.simpli.oops;

public class Rectangle extends Shape {

	

	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	int length,breadth;
	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle"+(length*breadth));

	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", color=" + color + "]";
	}
	
	
	

}
