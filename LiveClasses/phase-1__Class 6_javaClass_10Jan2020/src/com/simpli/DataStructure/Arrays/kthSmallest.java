package com.simpli.DataStructure.Arrays;

import java.util.Arrays;

public class kthSmallest {

	int find(int[] arr,int k) {
		
		Arrays.sort(arr);
		System.out.println("Array after sort:");
		displayArray(arr);
		System.out.println("kth smallest element is ");
		return arr[k-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kthSmallest obj = new kthSmallest();
		int[] arr = {33,44,11,66,1,9};
		displayArray(arr);
		System.out.println(obj.find(arr, 2));

	}
	private static void displayArray(int[] arr) {
		for(int values : arr) {
			System.out.print(values+" ");
		}
		System.out.println();
	}

}
