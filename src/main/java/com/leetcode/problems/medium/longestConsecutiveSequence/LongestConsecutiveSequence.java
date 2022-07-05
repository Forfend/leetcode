package com.leetcode.problems.medium.longestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] nums) {
        Set<Integer> items = new HashSet<>();

        for (int num : nums) {
            items.add(num);
        }

        int sequence = 0;

        for (int num : nums) {
            if (!items.contains(num - 1)) {
                int length = 0;

                while (items.contains(num + length)) {
                    length++;
                }

                if (length > sequence) {
                    sequence = length;
                }
            }
        }

        return sequence;
    }
}
