package com.leetcode.problems.easy.searchInsertPosition;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int medium;

        while (left <= right) {
            medium = (left + right) / 2;
            if (target == nums[medium]) {
                return medium;
            }

            if (target < nums[medium]) {
                right = medium - 1;
            } else {
                left = medium + 1;
            }
        }

        return left;
    }
}
