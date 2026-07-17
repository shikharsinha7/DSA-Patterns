/*
Problem: Search a 2D Matrix (LeetCode 74)
Link: https://leetcode.com/problems/search-a-2d-matrix/description/
Pattern: Binary Search
Approach: Treat the 2D grid like it's actually a flattened 1D sorted array, and binary search on it by converting the middle index back into a row and column.
Time: O(log(m*n)) | Space: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j > -1) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
