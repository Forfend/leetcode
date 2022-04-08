package com.leetcode.problems.easy.kthLargestElementInStream;

import java.util.PriorityQueue;

public class KthLargestElementInStream {

    private int k;
    private PriorityQueue<Integer> heap;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();

        for (int num : nums) {
            heap.add(num);
        }

        while (heap.size() != k) {
            heap.poll();
        }
    }

    public int add(int val) {
        this.heap.add(val);
        if (this.heap.size() > k) {
            this.heap.poll();
        }

        return this.heap.peek();
    }
}
