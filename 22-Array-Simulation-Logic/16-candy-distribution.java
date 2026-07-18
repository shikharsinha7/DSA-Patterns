/*
Problem: Candy Distribution (LeetCode 135)
Pattern: Array Simulation / In-place Logic
Approach: Two-pass greedy, no data structure. First pass left to right: give a child one more candy than their left neighbor if their rating is higher. Second pass right to left: give a child more than their right neighbor if their rating is higher, taking the max of what's already assigned. Sum both passes for the final answer.
Time: O(n) | Space: O(n) for the candy array (can be reduced to O(1) with a more clever single-pass slope-tracking approach if you want the harder version)
*/

// code goes here once solved
