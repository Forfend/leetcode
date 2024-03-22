package com.leetcode.problems.medium.KthLargestElementInArray;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : nums) {
            heap.offer(num);
        }

        while (heap.size() != k) {
            heap.poll();
        }

        return heap.peek();
    }

    /**
     * This method implements the quick select algorithm to find the kth largest element in an array.
     *
     * @param nums array of integers
     * @param k    kth largest element
     * @return kth largest element
     */
    public int findKthLargestQuickSelect(int[] nums, int k) {
        k = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        int pivot = nums[r];
        int p = l;

        for (int i = l; i < r; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p++;
            }
        }

        int temp = nums[p];
        nums[p] = nums[r];
        nums[r] = temp;

        if (k > p) {
            return quickSelect(nums, p + 1, r, k);
        } else if (k < p) {
            return quickSelect(nums, l, p - 1, k);
        } else {
            return nums[p];
        }
    }

}
