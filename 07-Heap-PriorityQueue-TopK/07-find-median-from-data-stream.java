/*
Problem: Find Median from Data Stream (LeetCode 295)
Pattern: Heap / Priority Queue / Top K
Approach: Two heaps — a max heap holding the smaller half of numbers, a min heap holding the bigger half. Keep them balanced in size, and the median comes straight from their tops.
Time: O(log n) per insertion, O(1) for median | Space: O(n)
*/

// code goes here once solved
