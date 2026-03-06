package com.simplilarn.oop.constructor;

public class EmpInfo {
	
	int id;
	String name;
	
	EmpInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id + " "+ name);
		
	}
	
	
	public static void main(String[] args) {
		EmpInfo empInfo = new EmpInfo(1,"Dhruvik");
		empInfo.display();
		empInfo.toString();
		
	}
}

class Pen {
	String refill;

	Pen(String refill) {
		this.refill = refill;
	}
}

class Parker extends Pen {

	Parker(String refill) {
		super(refill);
		
	}
	
	
	
}

