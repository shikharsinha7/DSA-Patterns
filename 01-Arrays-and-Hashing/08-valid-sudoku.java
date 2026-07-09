/*
Problem: Valid Sudoku (LeetCode 36)
Link: https://leetcode.com/problems/valid-sudoku/
Pattern: Arrays and Hashing
Approach: Keep a hashset each for every row, every column, and every 3x3 box. Walk through the board once and check each filled cell against the right sets for repeats.
Time: O(1) since board is always 9x9 | Space: O(1)
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Character>> cols = new HashMap<>();
        HashMap<String, HashSet<Character>> squares = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                if (val == '.') {
                    continue;
                }
                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());

                String squareKey = (r / 3) + "," + (c / 3);
                squares.putIfAbsent(squareKey, new HashSet<>());

                if (rows.get(r).contains(val) ||
                        cols.get(c).contains(val) ||
                        squares.get(squareKey).contains(val)) {
                    return false;
                }
                rows.get(r).add(val);
                cols.get(c).add(val);
                squares.get(squareKey).add(val);
            }
        }
        return true;
    }
}
