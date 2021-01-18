package com.simpli.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String input = "Re1gularExpressions@gmail.com";
		String pattern = "[a-zA-z@]+";
		//[^A-Z0-9]+
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find()) {
			System.out.print(input.substring(m.start(),m.end()));
		}
	}
}
