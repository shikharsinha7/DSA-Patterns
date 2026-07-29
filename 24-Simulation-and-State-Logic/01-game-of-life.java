/*
Problem: Game of Life, In-place (LeetCode 289)
Link: https://leetcode.com/problems/game-of-life/description/
Pattern: Simulation / Step-by-Step State Logic
Approach: The naive approach needs a second grid to avoid overwriting cells you still need to check. The O(1) space trick: encode both the old and new state into the same cell using extra bits (e.g., add 2 if the cell is becoming alive, subtract nothing if dying but was alive), then do a final pass to normalize every cell to just 0 or 1.
Time: O(m * n) | Space: O(1) with bit-encoding trick
*/

class Solution {
    public void gameOfLife(int[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                int nei = countNeighbours(board, r, c, ROWS, COLS);

                if(board[r][c] == 1){
                    if(nei == 2 || nei == 3){
                        board[r][c] = 3;
                    }
                }else if(nei == 3){
                    board[r][c] = 2;
                }
            }
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == 1){
                    board[r][c] = 0;
                }else if(board[r][c] == 2 || board[r][c] == 3){
                    board[r][c] = 1;
                }
            }
        }
    }
    private int countNeighbours(int[][] board, int row, int col, int ROWS, int COLS){
        int nei = 0;
        for(int i = row - 1; i < row + 2; i++){
            for(int j = col - 1; j < col + 2; j++){
                if((i == row && j == col) || i < 0 || j < 0 || i == ROWS || j == COLS){
                    continue;
                }
                else if(board[i][j] == 1 || board[i][j] == 3){
                    nei += 1;
                }
            }
        }
        return nei;
    }
}
