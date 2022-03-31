package com.leetcode.problems.easy.floodFill;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }

        dfsFill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfsFill(int[][] image, int row, int col, int color, int newColor) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length
                || image[row][col] != color) {
            return;
        }

        image[row][col] = newColor;
        dfsFill(image, row - 1, col, color, newColor);
        dfsFill(image, row + 1, col, color, newColor);
        dfsFill(image, row, col - 1, color, newColor);
        dfsFill(image, row, col + 1, color, newColor);

    }
}
