/*
Problem: House Robber (LeetCode 198)
Pattern: 1D Dynamic Programming
Approach: dp[i] = max(dp[i-1], dp[i-2] + nums[i]) — at every house you decide whether robbing it (plus whatever you had two houses back) beats skipping it.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
