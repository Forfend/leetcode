package com.leetcode.problems.easy.setMismatch;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        Map<Integer, Integer> numCount = new HashMap<>();

        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (numCount.containsKey(i) && numCount.get(i) == 2) {
                result[0] = i;
            }

            if (!numCount.containsKey(i)) {
                result[1] = i;
            }
        }

        return result;
    }
}
