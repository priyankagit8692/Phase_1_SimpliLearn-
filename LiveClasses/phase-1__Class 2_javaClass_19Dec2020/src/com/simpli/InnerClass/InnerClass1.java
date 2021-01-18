package com.simpli.InnerClass;
public class InnerClass1 {
	
	private String message = "Welcome to Java";
	
	class Inner{
		String hello = "Hello Learner";
		void greet() {
			//private member of outer class is accessible in inner class
			System.out.println(hello+","+message);
		}
	}
	
	public static void main(String[] args) {
		InnerClass1 outer = new InnerClass1();
		InnerClass1.Inner inner = outer.new Inner();
		inner.greet();
	}

}
