package com.leetcode.problems.medium.findFirstAndLastIndex;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = findLeftIndex(nums, target);
        int right = findRightIndex(nums, target);

        return new int[]{left, right};
    }

    private int findLeftIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int index = -1;

        while (left <= right) {
            int medium = left + (right - left) / 2;

            if (nums[medium] == target) {
                index = medium;
            }

            if (nums[medium] >= target) {
                right = medium - 1;
            } else {
                left = medium + 1;
            }
        }

        return index;
    }

    private int findRightIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int medium;

        int index = -1;

        while (left <= right) {
            medium = left + (right - left) / 2;

            if (nums[medium] == target) {
                index = medium;
            }

            if (nums[medium] <= target) {
                left = medium + 1;
            } else {
                right = medium - 1;
            }


        }

        return index;
    }
}
