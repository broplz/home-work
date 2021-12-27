package com.sbrf.reboot;

import java.math.BigInteger;

public class Calculator {
    public int getSubtraction(int a, int b) {
        return a - b;
    }

    public int getMultiplication(int a, int b) {
        return a * b;
    }

    public int getDivision(int a, int b) {
        return a / b;
    }

    public int getAddition(int a, int b) {
        return a + b;
    }

    public BigInteger getFactorial(int a) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public BigInteger getFactorialSub(int a, int b) {
        BigInteger resOfA;
        BigInteger resOfB;
        resOfA = getFactorial(a);
        resOfB = getFactorial(b);
        return resOfA.subtract(resOfB);
    }

    public BigInteger getFactorialAdd(int a, int b) {
        BigInteger resOfA;
        BigInteger resOfB;
        resOfA = getFactorial(a);
        resOfB = getFactorial(b);
        return resOfA.add(resOfB);
    }
}
