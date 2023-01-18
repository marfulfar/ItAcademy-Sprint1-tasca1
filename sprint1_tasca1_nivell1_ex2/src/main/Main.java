package main;

import car.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car mCar = new Car(1200);
		System.out.println(mCar.toString());
		
		Car.brake();
		
		mCar.accelerate();
		
	}

}
