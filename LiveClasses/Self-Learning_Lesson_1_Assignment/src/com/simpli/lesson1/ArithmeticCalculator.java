package com.simpli.lesson1;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input,in1,in2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		in1 = sc.nextInt();
		in2 = sc.nextInt();
		System.out.println("Enter the operation choice you want to perform:");
		while(true) {
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("Sum is:"+ add(in1,in2));
				break;
			case 2:
				System.out.println("Subtraction is:"+ subtract(in1,in2));
				break;
			case 3:
				System.out.println("Multiplication is:"+ multiply(in1,in2));
				break;
			case 4:
				System.out.println("Divide is:"+ divide(in1,in2));
				break;
			default:
				sc.close();
				System.out.println("Invalid Input!!");
				System.exit(0);
				break;
			}	
		}	
	}
	
	public static int add(int in1, int in2) {
		int sum = 0;
		sum = in1 + in2;
		return sum;
		
	}
	
	public static int subtract(int in1, int in2) {
		int sub = 0;
		sub = in1 - in2;
		return sub;
	}
	
	public static int multiply(int in1, int in2) {
		int mul = 0;
		mul = in1 * in2;
		return mul;
	}
	
	public static double divide(int in1, int in2) {
		double d = 0.0;
		try {
			d = in1 /in2;
		}
		catch(ArithmeticException e) {
			System.out.println("trying to divide by 0");
		}
		return d;
	}
}
