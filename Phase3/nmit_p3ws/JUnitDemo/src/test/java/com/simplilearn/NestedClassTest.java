package com.simplilearn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedClassTest {

	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test method -- NestedClassTest");
	}
	
	
	@Nested
	class A {
		
		@BeforeEach
		void beforeEach() {
			System.out.println("Before each test method of inner class A");
		}
		
		@AfterEach
		void afterEach() {
			System.out.println("After each test method of inner class A");
		}
		
		@Test
		void sampleTest() {
			System.out.println("Example test for method A");
		}
		@Test
		void sampleTest2() {
			System.out.println("Example test2 for method A");
		}
	}
}
