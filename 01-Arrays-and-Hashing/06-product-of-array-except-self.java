/*
Problem: Product of Array Except Self (LeetCode 238)
Pattern: Arrays and Hashing
Approach: Do two passes — one left to right building a prefix product, one right to left building a suffix product. Multiply prefix and suffix at each index to skip that index's own value.
Time: O(n) | Space: O(1) extra (not counting the output array)
*/

// code goes here once solved
