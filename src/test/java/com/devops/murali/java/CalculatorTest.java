package com.devops.murali.java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.devops.murali.java.calc.Calculator;

public class CalculatorTest {
    private Calculator calculator;
  
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
  
    @Test
    public void testSum() {
        int result = calculator.sum(2, 3);
        Assertions.assertEquals(5, result);
    }
  
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        Assertions.assertEquals(3, result);
    }
  
    @Test
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        Assertions.assertEquals(12, result);
    }
  
    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
}
