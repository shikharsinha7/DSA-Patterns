/*
Problem: Number of 1 Bits (LeetCode 191)
Pattern: Bit Manipulation
Approach: Repeatedly check the last bit using n & 1 and right shift, or use the slightly faster trick n & (n-1) which drops the lowest set bit each time.
Time: O(32) i.e. O(1) for fixed bit width | Space: O(1)
*/

// code goes here once solved
