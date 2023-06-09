package com.leetcode.problems.easy.findSmallestLetterGreaterThanTarget;

public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (target < letters[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (left < letters.length) {
            return letters[left];
        } else {
            return letters[0];
        }
    }
}
