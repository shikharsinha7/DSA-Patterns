/*
Problem: Coin Change (LeetCode 322)
Pattern: 1D Dynamic Programming
Approach: dp[amount] = the minimum of dp[amount - coin] + 1 across every coin — build up the cheapest way to make every amount from 0 up to the target.
Time: O(amount * number of coins) | Space: O(amount)
*/

// code goes here once solved
