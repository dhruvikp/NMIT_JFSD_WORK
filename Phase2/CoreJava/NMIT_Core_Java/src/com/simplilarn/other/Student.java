package com.simplilarn.other;

public class Student {
	
	static {
		System.out.println("Static block executed");
	}

	int rollNo;
	String name;
	
	static String college = "ABC College";
	
	Student(int r, String n) {
		rollNo = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollNo +" "+name+" "+Student.college);
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Dhruvik");
		Student s2 = new Student(2, "Rahul");
		
		s1.display();
		s2.display();
		
		int result = Calculator.add(10, 20);
		System.out.println(result);

	}

}


class Calculator {
	static int add (int a, int b) {
		return a+b;
	}
}
