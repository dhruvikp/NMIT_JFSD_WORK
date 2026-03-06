package com.simplilarn.oop;

public class Encapsulation {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("John");
		s1.setAge(20);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		
			

	}

}

class Student {
	private String name;
	private int  age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age >0) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	
}
