package com.simpli.String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("s1==s2 : "+s1==s2);
		String s3 = new String("Hell");
		String s4 = new String("Hello");
		System.out.println("s3==s4 :"+s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.replace('e','a'));
		System.out.println(s3.charAt(1));
		System.out.println(s1.length());
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s3.concat(" priyanka"));
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.isEmpty());

	}

}
