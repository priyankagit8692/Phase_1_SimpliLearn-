package com.simpli.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		try {
			a[11] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//e.toString();
			//e.getMessage();
		}
		

	}

}
