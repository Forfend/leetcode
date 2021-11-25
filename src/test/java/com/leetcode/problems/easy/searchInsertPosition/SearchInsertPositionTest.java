package com.leetcode.problems.easy.searchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    @Test
    public void testNotPresent() {
        int[] nums = {1, 3};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int target = 2;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(1, result);
    }

    @Test
    public void testNotPresentBid() {
        int[] nums = {1, 3, 5, 6};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int target = 7;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, result);
    }
}