/*
Problem: Longest Repeating Character Replacement (LeetCode 424)
Pattern: Sliding Window
Approach: Sliding window tracking frequency of the most common character inside it. The window is valid as long as (window length - count of most frequent char) is <= k, shrink when it's not.
Time: O(n) | Space: O(1) (26 letters max)
*/

// code goes here once solved
