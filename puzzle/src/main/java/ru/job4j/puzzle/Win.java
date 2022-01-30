package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 1
                        &&
                        (monoHorizontal(board, row) || monoVertical(board, cell))) {
                    rsl = true;
                }
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}
