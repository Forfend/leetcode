package com.leetcode.problems.easy.binarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(nums, target);
        assertEquals(4, result);
    }

    @Test
    public void testBinarySearchNegative() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(nums, target);
        assertEquals(-1, result);
    }
}