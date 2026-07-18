/*
Problem: Compare Version Numbers (LeetCode 165)
Pattern: String Simulation / In-place Logic
Approach: Walk both version strings simultaneously with two pointers, manually parsing out each dot-separated numeric chunk (skip using split() if you want the true O(1)-extra-space version) and comparing chunk by chunk. Missing trailing chunks are treated as zero.
Time: O(n + m) | Space: O(1) if parsed manually without split()
*/

// code goes here once solved
