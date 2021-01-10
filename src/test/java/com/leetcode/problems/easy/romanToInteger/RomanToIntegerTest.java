package com.leetcode.problems.easy.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {


    @Test
    void testRomanToInteger() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("III");
        assertEquals(3, result);
    }

    @Test
    void testRomanToInteger2() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("IV");
        assertEquals(4, result);
    }

    @Test
    void testRomanToInteger3() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("IX");
        assertEquals(9, result);
    }

    @Test
    void testRomanToInteger4() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("LVIII");
        assertEquals(58, result);
    }

    @Test
    void testRomanToInteger5() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("MCMXCIV");
        assertEquals(1994, result);
    }
}