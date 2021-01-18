package com.simpli.oops;

public class Circle extends Shape {

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	double radius;
	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle:"+Math.PI*radius*radius);

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	
	
}
