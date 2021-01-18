package com.simpli.oops;
public class Employee {
	private int emplId;
	private String FirstName;
	private String lastName;
	private float salary;
	private String designation;
	
	public Employee(int emplId, String firstName, String designation) {
		this.emplId = emplId;
		FirstName = firstName;
		this.designation = designation;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", FirstName=" + FirstName + ", lastName=" + lastName + ", salary="
				+ salary + ", designation=" + designation + "]";
	}
	
}
