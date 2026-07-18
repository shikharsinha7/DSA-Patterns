/*
Problem: First Missing Positive (LeetCode 41)
Pattern: Array Simulation / In-place Logic
Approach: The array-as-hashmap trick again - for every value v in range [1, n], swap it to its "correct" position at index v-1. After one cleanup pass of swaps, scan the array: the first index i where arr[i] != i+1 gives you the answer (i+1). If everything matches, the answer is n+1.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
