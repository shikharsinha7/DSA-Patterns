/*
Problem: Maximum Circular Subarray Sum
Pattern: Array Simulation / In-place Logic
Approach: Two cases to consider - either the max subarray doesn't wrap around (plain Kadane's), or it does wrap around, which equals (total sum - minimum subarray sum). Compute both with two passes of Kadane's logic (one for max, one for min) and take the better of the two, handling the all-negative edge case separately.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
