package com.simpli.oops;

public class Bicycle {
	
	int gear,speed;
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void seepdUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	public Bicycle(int gear, int speed) {
	
		this.gear = gear;
		this.speed = speed;
	}

	
	
}
