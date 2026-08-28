/*
Problem: Wiggle Sort (LeetCode 280 / 324)
Link: https://leetcode.com/problems/wiggle-sort-ii/description/
Pattern: Array Simulation / In-place Logic
Approach: For the simpler version (280): a single greedy pass works - for every index i, if the expected relation (nums[i] <= nums[i+1] for even i, nums[i] >= nums[i+1] for odd i) is violated, just swap. No sorting needed. The harder version (324, strict inequality with duplicates) needs a virtual index-mapping trick on top of a partial sort - worth attempting the easy version first.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = (n - 1) / 2;
        int end = n - 1;
        int[] result = new int[n];
        for(int i = 0; i < n; i += 2){
            result[i] = nums[mid--];
        }
        for(int i = 1; i < n; i += 2){
            result[i] = nums[end--];
        }
        System.arraycopy(result, 0, nums, 0, n);
    }
}
