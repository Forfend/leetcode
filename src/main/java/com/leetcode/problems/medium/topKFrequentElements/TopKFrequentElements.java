package com.leetcode.problems.medium.topKFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                int frequency = frequencyMap.get(num);
                frequencyMap.put(num, ++frequency);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) ->
                (a.getValue() - b.getValue()));

        for (Map.Entry<Integer, Integer> pair : frequencyMap.entrySet()) {
            heap.offer(pair);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;

        while (!heap.isEmpty()) {
            result[i] = heap.poll().getKey();
            i++;
        }

        return result;
    }
}
