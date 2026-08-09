/*
Problem: Rotate Image (LeetCode 48)
Link: https://leetcode.com/problems/rotate-image/description/
Pattern: Math and Geometry
Approach: Rotate the matrix in place by first transposing it (flip rows and columns), then reversing every row — that combination gives you a 90 degree clockwise rotation.
Time: O(n^2) | Space: O(1)
*/

class Solution {
    public void rotate(int[][] matrix) {
        // transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int li = 0;
            int ri = matrix[i].length - 1;
            while (li < ri) {
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }
}
