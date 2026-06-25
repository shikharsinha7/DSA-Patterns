/*
Problem: Longest Substring Without Repeating Characters (LeetCode 3)
Pattern: Sliding Window
Approach: Sliding window with a hashset tracking characters currently in the window. Expand the window to the right, and when you hit a duplicate, shrink from the left until it's gone.
Time: O(n) | Space: O(min(n, charset size))
*/

// code goes here once solved
