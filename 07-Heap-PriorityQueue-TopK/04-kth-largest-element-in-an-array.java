/*
Problem: Kth Largest Element in an Array (LeetCode 215)
Pattern: Heap / Priority Queue / Top K
Approach: Keep a min heap of size k, push every number in, and pop the smallest whenever it grows past k. Whatever's left at the root is the kth largest. (Quickselect gets this to O(n) average if you want it faster.)
Time: O(n log k) | Space: O(k)
*/

// code goes here once solved
