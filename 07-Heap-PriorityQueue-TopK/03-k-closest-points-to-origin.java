/*
Problem: K Closest Points to Origin (LeetCode 973)
Pattern: Heap / Priority Queue / Top K
Approach: Keep a max heap of size k based on distance from origin — if a new point is closer than the heap's current farthest point, swap it in. Heap at the end holds your answer.
Time: O(n log k) | Space: O(k)
*/

// code goes here once solved
