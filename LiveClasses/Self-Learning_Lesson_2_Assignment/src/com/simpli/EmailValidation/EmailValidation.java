package com.simpli.EmailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		int flag = 0;
		String input[] = {"RegularExpressions@gmail.com","priyankakumawat0086@gmail.com","priya34@gmail.com"};
		System.out.println("Email ids are:");
		for(String each : input) {
			System.out.println(each);
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the email Id you want to search");
		String in = scanner.next();
		if(isValid(in)) {
			System.out.println("Email id entered is in correct pattern");
		}
		else {
			System.out.println("Email id format is wrong");
		}
		for(String each : input) {
			if(each.equalsIgnoreCase(in)) {
				flag = 1;
				System.out.println("Email id found");
			}
		}
		if(flag == 0)
			System.out.println("Email id not found");
		
	}
	public static boolean isValid(String email) {
		String pattern = "^(.+)@(.+)$";
				//"[a-zA-z@.]+";
		Pattern p = Pattern.compile(pattern);
		if(email == null)
			return false;
		return p.matcher(email).matches();
	}
}
