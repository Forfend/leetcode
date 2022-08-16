package com.leetcode.problems.easy.firstUniqueCharacterInString;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (charCount.containsKey(s.charAt(i))) {
                Integer count = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i), ++count);
            } else {
                charCount.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
