package com.leetcode.problems.medium.containerWithMostWater;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxWater = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int width = r - l;

            int water = Math.min(height[l], height[r]) * width;

            maxWater = Math.max(maxWater, water);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxWater;
    }
}
