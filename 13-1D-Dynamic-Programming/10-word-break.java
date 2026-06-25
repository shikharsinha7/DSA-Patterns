/*
Problem: Word Break (LeetCode 139)
Pattern: 1D Dynamic Programming
Approach: dp[i] = true if there's some earlier index j where dp[j] is true and the substring from j to i is a valid dictionary word — basically checking if the string can be fully chopped into dictionary words.
Time: O(n^2 * average word length) | Space: O(n)
*/

// code goes here once solved
