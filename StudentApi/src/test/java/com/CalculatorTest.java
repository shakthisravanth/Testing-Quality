package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calc = new Calculator();
        int result = calc.add(2, 2);

        assertEquals(4, result);
    }

    @Test
    void testSubtraction() {

        Calculator calc = new Calculator();
        int result = calc.subtract(5, 3);

        assertEquals(2, result);
    }
}
