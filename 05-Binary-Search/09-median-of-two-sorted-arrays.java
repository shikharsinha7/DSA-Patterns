/*
Problem: Median of Two Sorted Arrays (LeetCode 4)
Pattern: Binary Search
Approach: Binary search on the smaller array to find the correct partition point, such that everything on the left side (across both arrays) is <= everything on the right side. The median comes from the values right around that partition.
Time: O(log(min(m, n))) | Space: O(1)
*/

// code goes here once solved
