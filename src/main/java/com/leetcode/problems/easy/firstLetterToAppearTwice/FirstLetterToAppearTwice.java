package com.leetcode.problems.easy.firstLetterToAppearTwice;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {

    public char repeatedCharacter(String s) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (letters.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            letters.add(s.charAt(i));
        }
        return ' ';
    }
}
