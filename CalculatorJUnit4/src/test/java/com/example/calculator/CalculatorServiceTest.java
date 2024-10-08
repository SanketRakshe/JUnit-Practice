package com.example.calculator;

import org.junit.Before;
import org.junit.Test;

import com.example.CalculatorService;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        int result = calculatorService.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.sub(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.mul(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = calculatorService.divide(6, 3);
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculatorService.divide(6, 0);
    }
}
