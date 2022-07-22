package com.leetcode.problems.medium.productArrayExceptSelf;

public class ProductArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = postfix * result[i];
            postfix = postfix * nums[i];
        }

        return result;
    }
}
