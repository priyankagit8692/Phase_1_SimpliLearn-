package com.simpli.Array;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ints = new int[2][3];
		ints[0][0] = 200;
		ints[0][1] = 300;
		ints[0][2] = 400;
		ints[1][0] = 500;
		
		System.out.println("rows length:"+ints.length);
		System.out.println("column length:"+ints[0].length);
		//number of bytes consumes for above is 6*4=24 bytes
		int[][] int1  = {{1,2,3},{4,5,6}};
		int[][] int2  = {{1,2},{4,5,6}};
		
		System.out.println("rows length:"+ints.length);
		System.out.println("column length:"+ints[0].length);
		System.out.println("column length:"+ints[1].length);

		

	}

}
