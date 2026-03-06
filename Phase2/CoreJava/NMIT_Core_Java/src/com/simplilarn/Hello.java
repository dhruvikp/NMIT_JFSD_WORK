package com.simplilarn;

import com.simplilarn.oop.access.*;

public class Hello {
	String name;
	
	static String collage = "ABC College";
	
	

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		int age = 25;
		
		System.out.println(age);
		
		long population = 80000000L;
		
		float price = 10.5f;
		double salary = 55000.75;
		
		boolean isActive = true;
		System.out.println(!isActive);
		
		
		int number = 10;
		double value = number;
		
		System.out.println(value);
	
		
		double val = 10.6;
		int num = (int) val;
		
		int a= 10;
		int b = 20;
		
		System.out.println(5>3);
		System.out.println(a == b);
		
		
		boolean hasLicense = true;
		if(age >=18 && hasLicense) {
			System.out.println("Can drive");
		}
		
		test();
		
		String res = (age >=18) ? "Adult": "Minor";
		System.out.println(res);
		
	}
	
	public static void test() {
		int x=10;
		x += 5;
		
		System.out.println(x);
		
		
		String role = "admin";
		
		if(role.equals("admin")) {
			System.out.println("Admin Dashboard");
		} else if(role.equals("manager")) {
			System.out.println("Manager Dashboard");
		} else {
			System.out.println("User Dashboard");
		}
		
		
		
		int day =3;
		switch(day) {
		case 1:
				System.out.println("Monday");
				break;
				
		case 2:
				System.out.println("Tuesday");
				break;
		
		case 3: 
			System.out.println("Wednesday");
			break;
			
		default:
				System.out.println("Invalid day");
		
		}
		
	}

}

class Test extends Employee {
	void test() {
		System.out.println(age);
	}
}