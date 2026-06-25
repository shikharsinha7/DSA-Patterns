/*
Problem: Daily Temperatures (LeetCode 739)
Pattern: Monotonic Stack
Approach: Keep a stack of indices where temperatures are in decreasing order. When a new bigger temperature comes in, pop all the smaller ones off and fill in their answer using the index gap.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
