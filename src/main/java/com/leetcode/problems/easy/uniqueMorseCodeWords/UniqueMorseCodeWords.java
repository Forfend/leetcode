package com.leetcode.problems.easy.uniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    private static final String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            StringBuilder morseWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                morseWord.append(MORSE[c - 'a']);
            }
            uniqueWords.add(morseWord.toString());
        }
        return uniqueWords.size();
    }
}
