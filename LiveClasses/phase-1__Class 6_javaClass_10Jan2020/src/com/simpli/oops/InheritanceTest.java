package com.simpli.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle(5, 50);
		System.out.println(bicycle);
		bicycle.applyBrake(10);
		System.out.println(bicycle.speed);
		System.out.println(bicycle.speed+20);

		MountainBike mountainBike = new MountainBike(7, 100, 25);
		System.out.println(mountainBike);
		mountainBike.applyBrake(10);
		System.out.println(mountainBike.speed);
		mountainBike.setSeatHeight(30);
		System.out.println(mountainBike.getSeatHeight());
		
		Bicycle bicycle2 = new MountainBike(11, 150,28);
		System.out.println(bicycle2);
		bicycle2.applyBrake(30);
		System.out.println(bicycle2.speed);
				
	}

}
