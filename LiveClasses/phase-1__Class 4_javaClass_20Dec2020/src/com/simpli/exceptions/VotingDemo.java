package com.simpli.exceptions;

public class VotingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		try {
			validateAge(age);
		}
		catch(InvalidAgeException i) {
			i.printStackTrace();
		}

	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("you are not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}

}
