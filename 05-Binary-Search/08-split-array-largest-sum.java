/*
Problem: Split Array Largest Sum (LeetCode 410)
Pattern: Binary Search
Approach: Binary search on the answer itself (the max subarray sum). For each candidate value, greedily check how many groups you'd need to split into without exceeding it, and find the smallest value where that's <= m groups.
Time: O(n log(sum)) | Space: O(1)
*/

// code goes here once solved
