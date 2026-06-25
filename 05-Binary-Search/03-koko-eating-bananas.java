/*
Problem: Koko Eating Bananas (LeetCode 875)
Pattern: Binary Search
Approach: Binary search on the eating speed itself (from 1 up to the biggest pile). For each candidate speed, check if she can finish all piles within h hours, and find the smallest speed where that's true.
Time: O(n log m), m = max pile size | Space: O(1)
*/

// code goes here once solved
