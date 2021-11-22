package com.leetcode.problems.easy.romanToInteger;

public class RomanToInteger {

    public int romanToInteger(String s) {
        int result = 0;
        int previous = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = convertCharToInt(s.charAt(i));

            if (currentValue > previous) {
                result += currentValue - previous - previous;
            } else {
                result += currentValue;
            }
            previous = currentValue;
        }

        return result;
    }

    private int convertCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
