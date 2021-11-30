package com.leetcode.problems.easy.reverseWords;

public class ReverseWords {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverse(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String reverse(String word) {
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            reversed.insert(0, word.charAt(i));
        }

        return reversed.toString();
    }
}
