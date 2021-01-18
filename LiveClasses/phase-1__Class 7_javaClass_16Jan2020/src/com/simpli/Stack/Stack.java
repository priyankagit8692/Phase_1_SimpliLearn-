package com.simpli.Stack;

public class Stack {
	static final int MAX = 5;
	int top;
	int arr[];
	
	Stack(){
		top = -1;
		arr = new int[MAX];
	}
	
	/**
	 * Adds an elememt onto top of stack
	 * @param x element to be inserted
	 * @returntrue if success
	 */
	boolean push(int x) {
		if( top >= MAX-1) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			top++;
			arr[top] = x;
			System.out.println(x+" pushed");
			return true;
		}
	}
	
	/**
	 * This method returns top of the stack 
	 * @return 0, if there is no element in stack or element from top of stack 
	 */
	int pop() {
		if(top < 0) {
			System.out.println("Stack is empty::::");
			return 0;
		}
		else {
			int a = arr[top];
			top--;
			System.out.println(a+" popped out of stack");
			return a;
		}
	}
	
	boolean isEmpty() {
		return top < 0;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.pop();
		System.out.println(stack.isEmpty());
		
	}
}
