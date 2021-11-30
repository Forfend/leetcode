package com.leetcode.problems.easy.reverseWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        ReverseWords reverseWords = new ReverseWords();
        String output = "s'teL ekat edoCteeL tsetnoc";
        String result = reverseWords.reverseWords("Let's take LeetCode contest");
        assertEquals(output, result);
    }
}