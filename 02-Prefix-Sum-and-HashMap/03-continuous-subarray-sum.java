/*
Problem: Continuous Subarray Sum (LeetCode 523)
Pattern: Prefix Sum + HashMap
Approach: Track running sum mod k. Store the first index where each remainder occurred. If the same remainder shows up again with a gap of at least 2, you've found a valid subarray.
Time: O(n) | Space: O(min(n, k))
*/

// code goes here once solved
