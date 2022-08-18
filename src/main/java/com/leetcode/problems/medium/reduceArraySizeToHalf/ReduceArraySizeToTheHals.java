package com.leetcode.problems.medium.reduceArraySizeToHalf;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReduceArraySizeToTheHals {

    public int mixSetSize(int[] arr) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        for (int item : arr) {
            numberCount.put(item, numberCount.getOrDefault(item, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) ->
                (b.getValue() - a.getValue()));

        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            heap.offer(entry);
        }

        int removedCount = 0;
        int result = 0;
        for (int i = 0; i < heap.size(); i++) {
            removedCount += heap.poll().getValue();
            result++;
            if (removedCount >= arr.length / 2) {
                break;
            }
        }

        return result;
    }
}
