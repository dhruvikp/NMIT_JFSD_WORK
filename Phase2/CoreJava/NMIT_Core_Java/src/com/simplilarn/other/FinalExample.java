package com.simplilarn.other;

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final Test t = new Test(5);
		t.x = 30; //allowed
		
		//t = new Test(5);
		
		
	}

}

 class Parent {
	final void display() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	// void display() { }  // ERROR
}


class Test {
	int x;
	
	Test(int x) {
		this.x = 0;
	}
	
	void show() {
		//x=20;
		System.out.println(x);
	}
}
