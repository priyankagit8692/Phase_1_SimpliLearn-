package com.simpli.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		try {
			int number1 = scanner.nextInt();
			System.out.println("Enter second number:");
			int number2 = scanner.nextInt();
			System.out.println("Output:"+number1/number2);
			System.exit(0);
		}catch (ArithmeticException arithException) {
			// TODO: handle exception
			System.out.println("You cannot divide by zero");
			arithException.printStackTrace();
		}
		catch (InputMismatchException exception) {
			// TODO: handle exception
			System.out.println("Please enter only numbers");
			exception.printStackTrace();
		}finally {
			System.out.println("inside finally block");
			scanner.close();
		}
		System.out.println("Program terminates.....");
	}

}
