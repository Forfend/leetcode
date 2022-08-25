package com.leetcode.problems.easy.ransomNote;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency = new int[26];

        for (Character c : magazine.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (Character c : ransomNote.toCharArray()) {
            if (frequency[c - 'a'] == 0) {
                return false;
            }
            frequency[c - 'a']--;
        }

        return true;
    }
}
