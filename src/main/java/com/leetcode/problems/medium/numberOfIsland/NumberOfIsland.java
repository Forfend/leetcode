package com.leetcode.problems.medium.numberOfIsland;

public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                islandCount += dfsIslandLookup(grid, row, col);
            }
        }

        return islandCount;
    }

    private int dfsIslandLookup(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return 0;
        }

        grid[row][col] = '0';
        dfsIslandLookup(grid, row - 1, col);
        dfsIslandLookup(grid, row + 1, col);
        dfsIslandLookup(grid, row, col - 1);
        dfsIslandLookup(grid, row, col + 1);

        return 1;
    }
}
