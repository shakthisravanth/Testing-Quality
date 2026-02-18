package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
	void testEquals() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.add(2, 2));
	}

	@Test
	void testTrue() {
		Calculator calc = new Calculator();
		assertTrue(calc.isPositive(5));
	}

	@Test
	void testFalse() {
		Calculator calc = new Calculator();
		assertFalse(calc.isPositive(-3));
	}

	@Test
	void testNotNull() {
		Calculator calc = new Calculator();
		assertNotNull(calc.getMessage());
	}
}