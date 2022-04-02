package com.leetcode.problems.easy.validPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String value = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                value += c;
            }
        }

        int left = 0;
        int right = value.length() - 1;

        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
