package com.leetcode.problems.medium.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();

        for (String s : strs) {
            char[] wordChars = s.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = String.valueOf(wordChars);
            if (groupMap.containsKey(sortedWord)) {
                groupMap.get(sortedWord).add(s);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                groupMap.put(sortedWord, group);
            }
        }

        return new ArrayList<>(groupMap.values());
    }
}
