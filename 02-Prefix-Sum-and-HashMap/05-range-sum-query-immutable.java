/*
Problem: Range Sum Query Immutable (LeetCode 303)
Pattern: Prefix Sum + HashMap
Approach: Precompute one prefix sum array up front. After that every range sum query is just subtracting two prefix sum values, done in O(1).
Time: O(n) build, O(1) per query | Space: O(n)
*/

// code goes here once solved
