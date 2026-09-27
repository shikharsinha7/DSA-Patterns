/*
Problem: Reverse Bits (LeetCode 190)
Link: https://leetcode.com/problems/reverse-bits/
Pattern: Bit Manipulation
Approach: Go through all 32 bits one at a time, shifting your result left and OR-ing in the current bit from the input number.
Time: O(32) i.e. O(1) | Space: O(1)
*/

class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            int bit = (n >> i) & 1;
            res = res | (bit << (31 - i));
        }
        return res;
    }
}
