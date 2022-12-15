package CodeCS;
import java.util.*;
public class Minesweeper {
//    Minesweeper is a popular single-player computer game. The goal is to locate mines within a rectangular grid of cells. At the start of the game, all of the cells are concealed. On each turn, the player clicks on a blank cell to reveal its contents, leading to the following result:
//
//    If there's a mine on this cell, the player loses and the game is over;
//    Otherwise, a number appears on the cell, representing how many mines there are within the 8 neighbouring cells (up, down, left, right, and the 4 diagonal directions);
//    If the revealed number is 0, each of the 8 neighbouring cells are automatically revealed in the same way.
//    You are given a boolean matrix field representing the distribution of bombs in the rectangular field. You are also given integers x and y, representing the coordinates of the player's first clicked cell - x represents the row index, and y represents the column index, both of which are 0-based.
//
//    Your task is to return an integer matrix of the same dimensions as field, representing the resulting field after applying this click. If a cell remains concealed, the corresponding element should have a value of -1.
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    public char[][] updateBoard(char[][] board, int[] click) {
        dfs(board, click[0], click[1]);
        return board;
    }
    private void dfs(char[][] board, int i, int j) {
        if (
                !isValidPosition(i, j, board) ||
                        !(board[i][j] == 'M' || board[i][j] == 'E')
        ) {
            return;
        }

        if (board[i][j] == 'M') {
            board[i][j] = 'X';
            return;
        } else {
            int bombNeighborCount = getBombNeighborCount(i, j, board);

            if (bombNeighborCount == 0) {
                board[i][j] = 'B';
                for (int[] dir : dirs) {
                    dfs(board, i + dir[0], j + dir[1]);
                }
            } else {
                board[i][j] = (char)(bombNeighborCount + '0');
            }
        }

    }

    private boolean isValidPosition(int i, int j, char[][] board) {
        return i >= 0 && i < board.length && j >= 0 && j < board[i].length;
    }

    private int getBombNeighborCount(int i, int j, char[][] board) {
        int x, y, count = 0;
        for (int[] dir : dirs) {
            x = i + dir[0];
            y = j + dir[1];

            if (isValidPosition(x, y, board) && (board[x][y] == 'M' || board[x][y] == 'X')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        char[][] board = new char[][]{
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}
        };
        int[] click = new int[]{3, 0};
        minesweeper.updateBoard(board, click);
    }

}
