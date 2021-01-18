package com.simpli.oops;

public class Square extends Shape {

	double side;
	public Square(String color, double side) {
		super(color);
		this.side = side;
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square"+(side*side));

	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", color=" + color + "]";
	}

	
	
}
