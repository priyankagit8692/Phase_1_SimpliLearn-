package com.simpli.InnerClass;

public class InnerClass3 {
	public static void main(String[] args) {
		AnonymousInnerClass anonymousObject = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Display method");
			}
		};
		AnonymousInnerClass object2 = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Display method of object2");
				
			}
		};
		object2.display();
		
	}

}

abstract class AnonymousInnerClass{
	public abstract void display();
}
