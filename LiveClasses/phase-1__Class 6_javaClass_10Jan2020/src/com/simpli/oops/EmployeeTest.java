package com.simpli.oops;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, "Priyanka", "Software Engineer");
		System.out.println(employee1);
		employee1.setSalary(233.44f);
		System.out.println(employee1.getSalary());
		// TODO Auto-generated method stub
		Employee employee2 = new Employee(2, "PK", "Software Engineer");
		System.out.println(employee2);
		employee1.setSalary(23113.44f);
		System.out.println(employee1.getSalary());
		Employee employee3 = new Employee();
		System.out.println(employee3);
	}

}
