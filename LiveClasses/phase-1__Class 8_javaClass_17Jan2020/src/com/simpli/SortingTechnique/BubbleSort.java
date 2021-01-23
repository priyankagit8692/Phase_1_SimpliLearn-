package com.simpli.SortingTechnique;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr) {
		System.out.println("Bubble sort ::");
		int length = arr.length, temp = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {

		int[] a = { 25,17,32,13,2 };
		System.out.println("Array before sorting : " + Arrays.toString(a));
		sort(a);
		System.out.println("Array after sorting : " + Arrays.toString(a));
	}

}