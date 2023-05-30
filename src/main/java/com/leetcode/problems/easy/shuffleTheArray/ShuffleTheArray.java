package com.leetcode.problems.easy.shuffleTheArray;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = n;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[left];
                left++;
            } else {
                result[i] = nums[right];
                right++;
            }
        }

        return result;
    }
}
