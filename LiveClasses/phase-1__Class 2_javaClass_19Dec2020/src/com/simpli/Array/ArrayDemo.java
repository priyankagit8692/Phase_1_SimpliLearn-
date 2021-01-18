package com.simpli.Array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1=10,i2=20,i3=80,i4=33;
		//when user do not know size of array
		//way 1
		int[] a1 = new int[-5];
		a1[0] = 100;
		a1[1] = 200;
		for(int a11: a1) {
			System.out.println(a11);
		}
		//way 2
		int a2[] = new int[5];
		
		//when user know size of array
		//way 3
		int[] a3 = {1,2,3,4,5};
		
		//way 4
		int a4[] = new int[] {1,2,3,4,5};

	}

}
