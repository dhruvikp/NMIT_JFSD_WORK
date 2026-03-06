package com.simplilarn.other;

public class StaticInnerClassExample {

	public static void main(String[] args) {
		
		Outer.Inner innerObj= new Outer.Inner();
		innerObj.display();

	}

}


class Outer {
	static class Inner {
		void display() {
			System.out.println("Static inner class");
		}
	}
}