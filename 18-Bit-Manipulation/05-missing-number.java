/*
Problem: Missing Number (LeetCode 268)
Link: https://leetcode.com/problems/missing-number/description/
Pattern: Bit Manipulation
Approach: XOR every array element together with every number from 0 to n — everything cancels except the missing one. (Or just use the sum formula n*(n+1)/2 minus the actual sum.)
Time: O(n) | Space: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
