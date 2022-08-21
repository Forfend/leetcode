package com.leetcode.problems.medium.sortCharactersByFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charFrequencyMap.put(s.charAt(i), charFrequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            heap.offer(entry);
        }

        StringBuilder result = new StringBuilder();
        while (!heap.isEmpty()) {
            Map.Entry<Character, Integer> charOccurrence = heap.poll();
            for (int i = 0; i < charOccurrence.getValue(); i++) {
                result.append(charOccurrence.getKey());
            }
        }

        return result.toString();
    }
}
