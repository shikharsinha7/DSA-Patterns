/*
Problem: Counting Bits (LeetCode 338)
Pattern: Bit Manipulation
Approach: dp[i] = dp[i >> 1] + (i & 1) — reuse the bit count of a smaller number you already computed (i shifted right by 1) instead of recounting from scratch.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
