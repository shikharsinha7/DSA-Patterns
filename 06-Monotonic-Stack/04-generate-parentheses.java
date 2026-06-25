/*
Problem: Generate Parentheses (LeetCode 22)
Pattern: Monotonic Stack
Approach: Backtracking/DFS while keeping count of how many open and close brackets you've used. Only add a close bracket if closeCount < openCount, and only add open if openCount < n.
Time: O(4^n / sqrt(n)) (Catalan number bound) | Space: O(n) recursion depth
*/

// code goes here once solved
