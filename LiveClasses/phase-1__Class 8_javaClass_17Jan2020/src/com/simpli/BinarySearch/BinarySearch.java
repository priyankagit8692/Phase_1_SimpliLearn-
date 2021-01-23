package com.simpli.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] a, int lower, int key, int upper) {
		
		int pivot = (lower + upper)/2;
		for(int mid = pivot; lower <= upper;mid = (lower + upper)/2) {
			if(a[mid] == key)
				return mid;
			if(a[mid] > key)
				upper = mid - 1;
			else
				lower = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] a = {2,3,6,7,9,10,23,50};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an element to search:");
		int input = scan.nextInt();
		int result = search(a, 0, input, a.length);
		if(result < 0)
			System.out.println("Searched element "+input+ " not found");
		else
			System.out.println("Searched element "+input+" found at index "+result);
		scan.close();

	}

}
