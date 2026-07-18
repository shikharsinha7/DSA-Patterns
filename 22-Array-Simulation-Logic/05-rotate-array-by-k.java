/*
Problem: Rotate Array by K Steps, In-place (LeetCode 189)
Pattern: Array Simulation / In-place Logic
Approach: The reversal trick - reverse the entire array, then reverse the first k elements, then reverse the remaining n-k elements. Three reversals combine to produce the rotated array without any extra space. Remember to take k modulo n first in case k > n.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
