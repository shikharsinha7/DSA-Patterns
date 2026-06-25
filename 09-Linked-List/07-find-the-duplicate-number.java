/*
Problem: Find the Duplicate Number (LeetCode 287)
Pattern: Linked List
Approach: Treat the array like a linked list where each value points to the next index. Run Floyd's cycle detection (fast/slow pointers) on it — the cycle entry point is the duplicate.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
