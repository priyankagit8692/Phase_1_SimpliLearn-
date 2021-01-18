package com.simpli.InnerClass;

public class InnerClass2 {
	private String message = "Welcome to Java";
	
	public void display() {
		class Inner{
			String hello = "Hello Learner";
			void greet() {
				//private member of outer class is accessible in inner class
				System.out.println(hello+","+message);
			}
		}
		Inner inner = new Inner();
		inner.greet();
	}
	public static void main(String[] args) {
		InnerClass2 innerClass2 = new InnerClass2();
		innerClass2.display();
		
	}

}
