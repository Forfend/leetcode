package com.leetcode.problems.medium.sortArray;

/**
 * This class implements a merge sort algorithm to sort an array of integers.
 * Its time complexity is O(n log n).
 * Its space complexity is O(n).
 * It is a stable sort algorithm.
 * The idea is to divide the array in two halves, sort each half and then merge the two halves.
 */
public class SortArray {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        merge(array, start, middle, end);
    }

    private void merge(int[] array, int start, int middle, int end) {
        int leftLength = middle - start + 1;
        int rightLength = end - middle;

        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = array[start + i];
        }

        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = array[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
        }

        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
        }
    }
}
