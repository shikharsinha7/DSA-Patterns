/*
Problem: Number of 1 Bits (LeetCode 191)
Link: https://leetcode.com/problems/number-of-1-bits/description/
Pattern: Bit Manipulation
Approach: Repeatedly check the last bit using n & 1 and right shift, or use the slightly faster trick n & (n-1) which drops the lowest set bit each time.
Time: O(32) i.e. O(1) for fixed bit width | Space: O(1)
*/

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
