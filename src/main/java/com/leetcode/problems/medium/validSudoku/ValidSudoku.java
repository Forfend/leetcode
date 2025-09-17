package com.leetcode.problems.medium.validSudoku;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int row = 9;
        int cols = 9;

        for (int r = 0; r < row; r++) {
            boolean validRow = checkRows(r, board);
            boolean validCol = checkCols(r, board);

            if (!(validRow && validCol)) {
                return false;
            }
        }

        for (int r = 0; r < row; r += 3) {
            for (int c = 0; c < cols; c += 3) {
                boolean valid3x3 = check3x3(r, c, board);
                if (!valid3x3) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean checkCols(int col, char[][] board) {
        int[] set = new int[9];
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == '.') {
                continue;
            }

            int value = Character.getNumericValue(board[r][col]);
            if (set[value - 1] != 0) {
                return false;
            }
            set[value - 1] = value;
        }
        return true;
    }

    private boolean checkRows(int row, char[][] board) {
        int[] set = new int[9];
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == '.') {
                continue;
            }

            int value = Character.getNumericValue(board[row][c]);
            if (set[value - 1] != 0) {
                return false;
            }
            set[value - 1] = value;
        }
        return true;
    }

    private boolean check3x3(int row, int col, char[][] board) {
        int[] set = new int[9];
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                int value = Character.getNumericValue(board[r][c]);
                if (set[value - 1] != 0) {
                    return false;
                }
                set[value - 1] = value;
            }
        }
        return true;
    }
}
