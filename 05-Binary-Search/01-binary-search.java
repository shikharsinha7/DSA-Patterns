/*
Problem: Binary Search (LeetCode 704)
Link: https://leetcode.com/problems/binary-search/description/
Pattern: Binary Search
Approach: The classic template — keep a left and right pointer, check the middle, and based on whether it's bigger or smaller than target, throw away half the search space each time.
Time: O(log n) | Space: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
