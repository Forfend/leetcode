package com.leetcode.problems.easy.twoSum;

import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
            }

            map.put(nums[i], i);
        }

        return result;
    }

}
