package com.leetcode.problems.medium.kokoEatBananas;

public class KokoEatBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int result = right;

        while (left <= right) {
            int k = left + (right - left) / 2;
            if (canEat(piles, h, k)) {
                right = k - 1;
                result = Math.min(result, k);
            } else {
                left = k + 1;
            }
        }

        return result;
    }

    private boolean canEat(int[] piles, int h, int k) {
        int sumHours = 0;
        for (int pile : piles) {
            sumHours += Math.ceil((double) pile / k);
        }

        return sumHours <= h;
    }
}
