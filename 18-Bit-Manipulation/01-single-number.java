/*
Problem: Single Number (LeetCode 136)
Link: https://leetcode.com/problems/single-number/description/
Pattern: Bit Manipulation
Approach: XOR every number in the array together. Every pair cancels itself out to 0, leaving only the one number that didn't have a pair.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
