package com.leetcode.problems.medium.maxAreaOfIsland;

public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    int area = dfsAreaLookup(grid, row, col, visited);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }

    private int dfsAreaLookup(int[][] grid, int row, int col, boolean[][] visited) {
        int area = 0;
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
                || grid[row][col] == 0 || visited[row][col]) {
            return area;
        }

        area += grid[row][col];
        visited[row][col] = true;

        area += dfsAreaLookup(grid, row - 1, col, visited);
        area += dfsAreaLookup(grid, row + 1, col, visited);
        area += dfsAreaLookup(grid, row, col - 1, visited);
        area += dfsAreaLookup(grid, row, col + 1, visited);

        return area;
    }
}
