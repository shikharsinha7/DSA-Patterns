/*
Problem: Largest Rectangle in Histogram (LeetCode 84)
Pattern: Monotonic Stack
Approach: Keep a stack of (index, height) pairs in increasing height order. When you hit a smaller height, pop off taller bars and calculate the rectangle area they could've made using the current index as the right boundary.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
