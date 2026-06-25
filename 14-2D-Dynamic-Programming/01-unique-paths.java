/*
Problem: Unique Paths (LeetCode 62)
Pattern: 2D Dynamic Programming
Approach: dp[r][c] = dp[r-1][c] + dp[r][c-1] — number of ways to reach each cell is the sum of ways to reach the cell above it and the cell to its left.
Time: O(m*n) | Space: O(m*n) (can shrink to O(n))
*/

// code goes here once solved
