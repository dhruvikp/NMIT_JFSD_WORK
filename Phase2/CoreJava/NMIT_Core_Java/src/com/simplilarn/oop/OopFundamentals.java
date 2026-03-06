package com.simplilarn.oop;

public class OopFundamentals {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.start();
	}

}

class Car {
	String color;
	int speed;
	
	void start() {
		System.out.println("Car started");
	}
	
	void stop() {
		System.out.println("Car stopped");
	}
}
