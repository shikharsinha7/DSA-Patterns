/*
Problem: Minimum Interval to Include Each Query (LeetCode 1851)
Pattern: Intervals
Approach: Sort intervals by start and sort the queries. Use a min heap of (end, size) for intervals that have already started — for each query, pop expired intervals off and the smallest remaining one is your answer.
Time: O((n + q) log n) | Space: O(n)
*/

// code goes here once solved
