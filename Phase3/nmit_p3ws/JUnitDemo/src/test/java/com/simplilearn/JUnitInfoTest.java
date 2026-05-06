package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitInfoTest {
	
	
	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll invoked");
	}
	
	
	@BeforeEach
	void init() {
		System.out.println("Before each init()");
	}
	
	
	@Test
	void test() {
		
		String str = null;
		
		String str2 = "some value";
		
		Assertions.assertNull(str);
		Assertions.assertTrue((4 > 0));
		Assertions.assertNotNull(str2);
		
		String[] a1 = {"A","B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
		
	}
	
	@Test
	void test2() {
		System.out.println("Test2 gets executed..");
	}
	
	
	@AfterEach
	void tearDown() {
		System.out.println("After each executed");
	}
	
	@AfterAll
	static void tearDownAll() {
		System.out.println("After all tearDown invoked.");
	}
	
	
	

}
