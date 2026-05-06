package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator c;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	public void testAdditionCalculator() {
		int value = c.add(5, 2);
		Assertions.assertEquals(7, value);
	}
	
	@Test
	public void testAddCalcualator_whenNeg() {
		int value = c.add(-5, -2);
		Assertions.assertEquals(-7, value);
	}
}
