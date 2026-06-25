/*
Problem: Longest Common Subsequence (LeetCode 1143)
Pattern: 2D Dynamic Programming
Approach: dp[i][j] = dp[i-1][j-1] + 1 if the characters match, otherwise max(dp[i-1][j], dp[i][j-1]) — classic 2D table comparing both strings.
Time: O(m*n) | Space: O(m*n)
*/

// code goes here once solved
