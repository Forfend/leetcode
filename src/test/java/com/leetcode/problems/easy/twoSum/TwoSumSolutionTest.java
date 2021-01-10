package com.leetcode.problems.easy.twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumSolutionTest {

    @Test
    void testTwoSum() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void testTwoSum2() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    void testTwoSum3() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}