package com.leetcode.problems.easy.reverseString;

import java.util.Stack;

public class ReverseString {

    public void reverseStringV1(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l <= r) {
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
    }

    public void reverseStringV2(char[] s) {
        Stack<Character> chars = new Stack<>();

        for (char c : s) {
            chars.push(c);
        }

        int index = 0;
        while (!chars.isEmpty()) {
            s[index] = chars.pop();
            index++;
        }
    }

}
