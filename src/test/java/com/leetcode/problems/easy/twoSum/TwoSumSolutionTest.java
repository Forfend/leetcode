package com.leetcode.problems.easy.twoSum;

import junit.framework.TestCase;
import org.junit.Test;

public class TwoSumSolutionTest extends TestCase {

    @Test
    public void testTwoSum() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testTwoSum2() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testTwoSum3() {
        TwoSumSolution solution = new TwoSumSolution();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}