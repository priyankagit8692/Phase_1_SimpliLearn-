package com.simpli.oops;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int choice ;
		while(true) {
			Shape shape = null;
			choice = showMenu(scanner);
			switch(choice) {
			case 1:
				shape = new Square("Red", 20);
				System.out.println(shape);
				shape.calculateArea();
				break;
			case 2:
				shape = new Rectangle("Blue",20, 20);
				System.out.println(shape);
				shape.calculateArea();
				break;
			case 3:
				shape = new Circle("Yellow", 2.5);
				System.out.println(shape);
				shape.calculateArea();
				break;
				default:
					scanner.close();
					System.out.println("Program terminate");
					System.exit(0);
					
			}
		
		}
		

	}

	private static int showMenu(Scanner scanner) {
		System.out.println("Please enter an option:");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("Press any number to exit:");
		int choice = scanner.nextInt();
		return choice;
	}

}
