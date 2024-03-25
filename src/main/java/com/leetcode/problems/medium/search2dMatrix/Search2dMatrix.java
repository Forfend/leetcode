package com.leetcode.problems.medium.search2dMatrix;

public class Search2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            int left = 0;
            int right = matrix[row].length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (target > matrix[row][mid]) {
                    left = mid + 1;
                } else if (target < matrix[row][mid]) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
