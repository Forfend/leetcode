package com.leetcode.problems.medium.longestSubstringWithoutRepeating;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();

        int left = 0;
        int length = 0;

        for (int right = 0; right < s.length(); right++) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(right));
                left++;
            }

            chars.add(s.charAt(right));
            length = Math.max(length, right - left - 1);
        }

        return length;
    }
}
