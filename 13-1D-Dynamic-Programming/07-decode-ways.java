/*
Problem: Decode Ways (LeetCode 91)
Pattern: 1D Dynamic Programming
Approach: dp[i] = dp[i-1] (if the single digit at i is valid) + dp[i-2] (if the two-digit combo ending at i is valid 10-26) — counts ways to decode up to each position.
Time: O(n) | Space: O(1) with rolling variables
*/

// code goes here once solved
