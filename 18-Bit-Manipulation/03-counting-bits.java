/*
Problem: Counting Bits (LeetCode 338)
Link: https://leetcode.com/problems/counting-bits/description/
Pattern: Bit Manipulation
Approach: dp[i] = dp[i >> 1] + (i & 1) — reuse the bit count of a smaller number you already computed (i shifted right by 1) instead of recounting from scratch.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int offset = 1;

        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
