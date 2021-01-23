package com.simpli.SortingTechnique;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(int[] a) {
		System.out.println("Insertion sort::");
		int length = a.length;
		for(int j = 1; j < length ;j++) {
			int temp = a[j];
			int i = j-1;
			while((i > -1) &&  a[i] > temp) {
				a[i+1] = a[i];
				i--;
			}
		   a[i+1] = temp ;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 25,17,32,13,2 };
		System.out.println("Array before sorting : " + Arrays.toString(a));
		sort(a);
		System.out.println("Array after sorting : " + Arrays.toString(a));
	}

}
