package com.simpli.LinearSearch;
import java.util.Scanner;

public class LinearSearch {
	
	public static int search(int a[],int x) {
		int length = a.length;
		for(int i = 0; i < length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,11,55,6,23};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an element to search:");
		int input = scan.nextInt();
		int result = search(a, input);
		if(result < 0)
			System.out.println("Searched element "+input+ " not found");
		else
			System.out.println("Searched element "+input+" found at index "+result);


	}

}
