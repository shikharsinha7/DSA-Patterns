/*
Problem: Minimum Window Substring (LeetCode 76)
Pattern: Sliding Window
Approach: Expand the window right until it contains every character needed (tracked with a frequency map), then shrink from the left while it's still valid, keeping track of the smallest valid window seen.
Time: O(n) | Space: O(m), m = length of t
*/

// code goes here once solved
