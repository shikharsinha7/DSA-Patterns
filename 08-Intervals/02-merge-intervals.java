/*
Problem: Merge Intervals (LeetCode 56)
Pattern: Intervals
Approach: Sort all intervals by start time first. Then walk through and merge the current interval into the last one in your result if they overlap, otherwise just add it as a new entry.
Time: O(n log n) | Space: O(n)
*/

// code goes here once solved
