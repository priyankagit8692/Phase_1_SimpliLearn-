package com.simpli.RotateArray;
public class RotateArray {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,6,7};
		rotate(input,3);
		displayArray(input);
	}

	private static void rotate(int[] input, int k) {
		// TODO Auto-generated method stub
		
		int size = input.length;
		int[] result = new int[size];
		for(int i = 0 ;i < k ;i++) {
			result[i] = input[size-k+i];
		}
		int j=0;
		for(int i = k; i<size;i++) {
			result[i] = input[j];
			j++;
		}
		System.arraycopy(result, 0, input, 0, size);
		
	}
	
	private static void displayArray(int[] arr) {
		for(int values : arr) {
			System.out.print(values+" ");
		}
		System.out.println();
	}

}
