package com.simplilarn.oop;

public class InheritanceExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Puppy p = new Puppy();
		p.eat();

	}

}

class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Cat extends Animal {
	void meow() {
		super.eat();
		System.out.println("Cat meowing..");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}

class Puppy extends Dog {
	void weep() {
		System.out.println("Weeping..");
	}
}
