package com.simpli.Array;

import java.util.Scanner;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries[] = {"India","US","Australia"};
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter country:");
			String input = scan.next();
			if(input.equals("E"))
				System.exit(0);
			searchCountry(countries, input);	
		}
		//System.exit(0);
	}

	private static void searchCountry(String[] countries, String input) {
		boolean isFound = false;
		for(String country : countries) {
			if(country.equals(input)) {
				isFound=true;
				break;
			}
		}
		if(isFound) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
