/*
Problem: Min Cost Climbing Stairs (LeetCode 746)
Pattern: 1D Dynamic Programming
Approach: dp[i] = min(dp[i-1], dp[i-2]) + cost[i] — track the cheapest way to reach each step using the two steps before it.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
