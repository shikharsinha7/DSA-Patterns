/*
Problem: Container With Most Water (LeetCode 11)
Link: https://leetcode.com/problems/container-with-most-water/description/
Pattern: Two Pointers
Approach: Two pointers at both ends. Always move the pointer with the smaller height inward, since that's the one limiting how much water you can hold — keep tracking the max area seen.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
