package com.leetcode.problems.medium.sortColors;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] counts = new int[3];

        for (int num : nums) {
            counts[num]++;
        }

        int i = 0;
        for (int n = 0; n < counts.length; n++) {
            for (int j = 0; j < counts[n]; j++) {
                nums[i] = n;
                i++;
            }
        }
    }
}
