package com.simpli.oops;

public class TestMultipleInterInher implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultipleInterInher obj = new TestMultipleInterInher();
		obj.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		Interface2.super.show();
	}

}
