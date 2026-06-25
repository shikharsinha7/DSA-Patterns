/*
Problem: Sliding Window Maximum (LeetCode 239)
Pattern: Sliding Window
Approach: Keep a deque (double ended queue) of indices that stays in decreasing order of value. Pop smaller values off the back when a bigger one comes in, and pop the front when it falls outside the window.
Time: O(n) | Space: O(k)
*/

// code goes here once solved
