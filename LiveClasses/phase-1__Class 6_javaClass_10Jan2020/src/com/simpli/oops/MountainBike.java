package com.simpli.oops;

public class MountainBike extends Bicycle {
	int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		System.out.println("Inside apply brake of Mountain");
		this.speed = this.speed - decrement - 10;
	}
	
	
	
}
