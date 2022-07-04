package com.leetcode.problems.easy.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctItems = new HashSet<>();

        for (int num : nums) {
            if (distinctItems.contains(num)) {
                return true;
            } else {
                distinctItems.add(num);
            }
        }
        return false;
    }
}
