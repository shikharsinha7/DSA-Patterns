/*
Problem: Maximum Circular Subarray Sum (LeetCode 918)
Link: https://leetcode.com/problems/maximum-sum-circular-subarray/
Pattern: Array Simulation / In-place Logic
Approach: Two cases to consider - either the max subarray doesn't wrap around (plain Kadane's), or it does wrap around, which equals (total sum - minimum subarray sum). Compute both with two passes of Kadane's logic (one for max, one for min) and take the better of the two, handling the all-negative edge case separately.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0];
        int globMin = nums[0];
        int currMax = 0;
        int currMin = 0;
        int total = 0;
        for(int num : nums){
            currMax = Math.max(currMax + num, num);
            currMin = Math.min(currMin + num, num);
            total += num;
            globMax = Math.max(globMax, currMax);
            globMin = Math.min(globMin, currMin);
        }
        return globMax > 0 ? Math.max(globMax, total - globMin) : globMax;
    }
}
