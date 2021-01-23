package com.simpli.SortingTechnique;

import java.util.Arrays;

public class SelectionSort {
	
	public static void sort(int[] a) {
		System.out.println("Selection sort::");
		int length = a.length,temp=0;
		for(int i = 0;i < length-1; i++) {
			for(int j = i+1; j < length; j++) {
				if(a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
	public static void main(String[] args) {
		
		int[] a = {3,1,2,5,4};
		System.out.println("Array before sorting : "+Arrays.toString(a));
		sort(a);
		System.out.println("Array after sorting : "+Arrays.toString(a));
	}

}
