package com.leetcode.problems.medium.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;
            int value = nums[i];

            while (l < r) {
                int treeSum = value + nums[l] + nums[r];

                if (treeSum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(value);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);

                    triplets.add(triplet);
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }

                } else if (treeSum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return triplets;
    }
}
