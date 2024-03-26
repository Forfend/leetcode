package com.leetcode.problems.easy.findNumberHigherOrLower;

public class FindNumberHigherOrLower {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int m = left + (right - left) / 2;

            if (guess(m) == 0) {
                return m;
            } else if (guess(m) == -1) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }

        return left;
    }

    private int guess(int num) {
        return 0;
    }
}
