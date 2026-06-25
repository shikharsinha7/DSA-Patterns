/*
Problem: Non-Overlapping Intervals (LeetCode 435)
Pattern: Intervals
Approach: Sort intervals by end time. Greedily keep an interval if it doesn't overlap with the last one you kept, otherwise count it as one you'd need to remove.
Time: O(n log n) | Space: O(1)
*/

// code goes here once solved
