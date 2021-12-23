package com.sbrf.reboot.calculator;

import com.sbrf.reboot.Calculator;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void getAddition() {
        assertEquals(9, new Calculator().getAddition(4, 5));
    }

    @Test
    void getSubtraction() {
        assertEquals(-1, new Calculator().getSubtraction(4, 5));
    }

    @Test
    void getMultiplication() {
        assertEquals(20, new Calculator().getMultiplication(4, 5));
    }

    @Test
    void getDivision() {
        assertEquals(3, new Calculator().getDivision(9, 3));
    }

    @Test
    void getFactorial() {
        assertEquals(BigInteger.valueOf(3_628_800), new Calculator().getFactorial(10));
    }

    @Test
    void getFactorialSub() {
        assertEquals(BigInteger.valueOf(357840), new Calculator().getFactorialSub(9, 7));
    }

    @Test
    void getFactorialAdd() {
        assertEquals(BigInteger.valueOf(725760), new Calculator().getFactorialAdd(9, 9));
    }
    @Test
    void classHasSevenMethods() {
        assertEquals(7, Calculator.class.getMethods().length - Object.class.getMethods().length);
    }
}