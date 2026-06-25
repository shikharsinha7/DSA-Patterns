/*
Problem: Interleaving String (LeetCode 97)
Pattern: 2D Dynamic Programming
Approach: dp[i][j] = true if s3's prefix can be built by interleaving the first i characters of s1 and first j characters of s2 — checking which string the last matched character could've come from.
Time: O(m*n) | Space: O(m*n) (can shrink to O(n))
*/

// code goes here once solved
