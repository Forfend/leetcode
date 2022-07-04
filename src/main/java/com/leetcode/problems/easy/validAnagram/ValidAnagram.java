package com.leetcode.problems.easy.validAnagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, ++count);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            } else {
                int count = charCountMap.get(c);
                charCountMap.put(c, --count);
            }
        }

        return true;
    }
}
