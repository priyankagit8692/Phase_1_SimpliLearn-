package com.simpli.constructor;

import java.util.Scanner;

public class Student {
	int studentId;
	String name;
	boolean assStatus;

	Student(int id, String name) {
		this.studentId = id;
		this.name = name;
	}

	Student(int id, String name, boolean assStatus) {
		this(id, name);
		this.assStatus = assStatus;
	}

	// Default constructor is mandatory if
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		Student student1 = new Student(10,"Priyanka",false);
		System.out.println(student1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		Student student2 = new Student(10,name,false);
		System.out.println(student2);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", assStatus=" + assStatus + "]";
	}

	
	
}
