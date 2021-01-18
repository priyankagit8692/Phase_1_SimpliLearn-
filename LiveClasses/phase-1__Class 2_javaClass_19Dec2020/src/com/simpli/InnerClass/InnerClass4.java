package com.simpli.InnerClass;

public class InnerClass4 {
	
	static class Inner{
		public void display() {
			System.out.println("inner static method ");
		}
	}
	public static void main(String[] args) {
		InnerClass4.Inner inner = new InnerClass4.Inner();
		inner.display();
	}

}
