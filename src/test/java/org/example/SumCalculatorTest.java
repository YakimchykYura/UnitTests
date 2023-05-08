package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }
    @Test
    void sumTest1() {
        int actual1 = calculator.sum(1);
        int expected1 = 1;
        Assertions.assertEquals(expected1,actual1);
    }
    @Test
    void sumTest2() {
        int actual2 = calculator.sum(3);
        int expected2 = 6;
        Assertions.assertEquals(expected2,actual2);
    }
    @Test
    void sumTest3() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.sum(0));
    }
}