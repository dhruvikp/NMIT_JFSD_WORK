package com.simplilearn;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicDemoTest {
	@BeforeEach
	public void initEach() {
		System.out.println("Before each initEach method called");
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTests() {	
		return Arrays.asList(
					DynamicTest.dynamicTest("simple dynamic test", () -> Assertions.assertTrue(true)),
					DynamicTest.dynamicTest("simple dynamic test1", () -> Assertions.assertTrue(true))
				);			
	}
}
