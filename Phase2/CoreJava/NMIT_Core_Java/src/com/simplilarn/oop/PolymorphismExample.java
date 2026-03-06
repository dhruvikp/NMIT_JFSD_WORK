package com.simplilarn.oop;

public class PolymorphismExample {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int res = c.add(3, 4);
		System.out.println(res);
		
		Animal1 animal = new Dog1();
		animal.sound();
	}

}

class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add(double a, double b) {
		return a+b;
	}
}

class Animal1 {
	void sound() {
		System.out.println("Animal Makes sound");
	}
}

class Dog1 extends Animal1 {
	void sound() {
		System.out.println("Dog barks");
	}
}