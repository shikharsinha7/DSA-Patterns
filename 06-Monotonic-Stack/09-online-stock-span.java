/*
Problem: Online Stock Span (LeetCode 901)
Pattern: Monotonic Stack
Approach: Keep a stack of (price, span) pairs in decreasing price order. When a new price comes in, pop and add up the spans of everything smaller-or-equal, then push the combined span.
Time: O(1) amortized per call | Space: O(n)
*/

// code goes here once solved
