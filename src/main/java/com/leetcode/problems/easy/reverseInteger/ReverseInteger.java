package com.leetcode.problems.easy.reverseInteger;

public class ReverseInteger {

    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int last = x % 10;
            reversed = reversed * 10 + last;
            x = x / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)reversed;
    }
}
