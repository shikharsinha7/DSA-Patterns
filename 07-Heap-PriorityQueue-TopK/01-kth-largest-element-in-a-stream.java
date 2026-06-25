/*
Problem: Kth Largest Element in a Stream (LeetCode 703)
Pattern: Heap / Priority Queue / Top K
Approach: Keep a min heap that never grows bigger than size k. The smallest element in that heap (the root) is always the kth largest seen so far.
Time: O(log k) per insertion | Space: O(k)
*/

// code goes here once solved
