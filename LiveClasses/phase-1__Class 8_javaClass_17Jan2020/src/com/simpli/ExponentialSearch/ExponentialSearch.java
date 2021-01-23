package com.simpli.ExponentialSearch;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

	public static int search(int[]a,int key) {
		int length = a.length;
		if(a[0] == key)
			return 0;
		int i = 1;
		while(i < length && a[i] <= key) {
			i = i*2;
		}
		int keyIndex = Arrays.binarySearch(a,i/2,Math.min(i, length),key);
		return keyIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,3,6,7,9,10,23,50};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an element to search:");
		int input = scan.nextInt();
		int result = search(a,input);
		if(result < 0)
			System.out.println("Searched element "+input+ " not found");
		else
			System.out.println("Searched element "+input+" found at index "+result);
		scan.close();
	}

}
