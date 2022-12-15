package com.leetcode.problems.easy.validParentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (char p : s.toCharArray()) {
            if (p == '(' || p == '{' || p == '[') {
                parentheses.push(p);
            } else {
                if (!parentheses.isEmpty()) {
                    char top = parentheses.peek();
                    if ((top == '(' && p == ')')
                            || (top == '[' && p == ']')
                            || (top == '{' && p == '}')) {
                        parentheses.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }

        return parentheses.isEmpty();
    }

}
