/*
Problem: Wiggle Sort (LeetCode 280 / 324)
Pattern: Array Simulation / In-place Logic
Approach: For the simpler version (280): a single greedy pass works - for every index i, if the expected relation (nums[i] <= nums[i+1] for even i, nums[i] >= nums[i+1] for odd i) is violated, just swap. No sorting needed. The harder version (324, strict inequality with duplicates) needs a virtual index-mapping trick on top of a partial sort - worth attempting the easy version first.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
