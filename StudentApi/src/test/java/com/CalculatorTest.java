package com;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	Calculator calc;

	@BeforeEach
	void setUp() {
		calc = new Calculator();
		System.out.println("Setting up calculator...");
	}

	@AfterEach
	void tearDown() {
		System.out.println("Test finished.");
	}

	@Test
	void testAddition() {
		assertEquals(4, calc.add(2,2));
	}

	@Test
	void testTrue() {
		assertTrue(calc.isPositive(5));
	}
}