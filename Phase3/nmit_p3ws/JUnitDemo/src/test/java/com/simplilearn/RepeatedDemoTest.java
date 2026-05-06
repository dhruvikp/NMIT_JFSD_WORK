package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedDemoTest {

	
	@BeforeEach
	public void initEach() {
		System.out.println("Before each initEach method called");
	}
	
	
	@Test
	@RepeatedTest(1000)
	void addNumber() {
		Calculator c = new Calculator();
		Assertions.assertEquals(2, c.add(1, 1));
		System.out.println("--- AddNumber testcase executed---");
	}
}
