package com.simpli.StringBuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append("hello");
		System.out.println(buffer.capacity());
		buffer.replace(1, 2,"a");
		System.out.println(buffer);
		buffer.delete(2, 2);
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		buffer.insert(1, "hh");
		System.out.println(buffer);
		
		String s1 = "Welcome";
		StringBuilder sb = new StringBuilder();
		System.out.println(s1);
	}

}
