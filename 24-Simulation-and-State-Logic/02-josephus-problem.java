/*
Problem: Josephus Problem
Pattern: Simulation / Step-by-Step State Logic
Approach: Can be simulated directly with a circular data structure, but the elegant O(n) time, O(1) space version uses a recurrence relation: position(n, k) = (position(n-1, k) + k) % n, built up iteratively from the base case of 1 person remaining. No actual circle needs to be simulated.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
