package com.simpli.collection;

public class Student {

	private int rno;
	private String name;
	
	public Student(int rno,String name) {
		this.rno = rno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
	

}
