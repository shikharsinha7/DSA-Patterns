/*
Problem: Next Permutation (LeetCode 31)
Pattern: Array Simulation / In-place Logic
Approach: Pure index logic, no data structure helps here. Scan from the right to find the first index i where arr[i] < arr[i+1] (the "break point"). If none exists, the array is the last permutation - reverse it entirely. Otherwise, scan from the right again to find the smallest element greater than arr[i], swap them, then reverse everything after index i to get the smallest possible suffix.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
