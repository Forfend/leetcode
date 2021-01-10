package com.leetcode.problems.easy.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_NUMBERS = new HashMap<>();

    static {
        ROMAN_NUMBERS.put('I', 1);
        ROMAN_NUMBERS.put('V', 5);
        ROMAN_NUMBERS.put('X', 10);
        ROMAN_NUMBERS.put('L', 50);
        ROMAN_NUMBERS.put('C', 100);
        ROMAN_NUMBERS.put('D', 500);
        ROMAN_NUMBERS.put('M', 1000);
    }

    public int romanToInteger(String s) {
        int result = 0;
        int coefficient;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                if (isPreviousLess(chars[i], chars[i - 1])) {
                    result -= ROMAN_NUMBERS.get(chars[i - 1]);
                    coefficient = ROMAN_NUMBERS.get(chars[i]) - ROMAN_NUMBERS.get(chars[i - 1]);
                } else {
                    coefficient = ROMAN_NUMBERS.get(chars[i]);
                }
                result += coefficient;

            } else {
                result += ROMAN_NUMBERS.get(chars[i]);
            }
        }

        return result;
    }

    private boolean isPreviousLess(char current, char previous) {
        return ROMAN_NUMBERS.get(current) > ROMAN_NUMBERS.get(previous);
    }

}
