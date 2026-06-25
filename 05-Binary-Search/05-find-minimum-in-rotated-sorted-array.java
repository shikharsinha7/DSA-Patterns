/*
Problem: Find Minimum in Rotated Sorted Array (LeetCode 153)
Pattern: Binary Search
Approach: Binary search comparing mid to right. If mid's value is greater than right's, the minimum has to be somewhere in the right half, otherwise it's in the left half (including mid).
Time: O(log n) | Space: O(1)
*/

// code goes here once solved
