/*
Problem: Longest Consecutive Sequence (LeetCode 128)
Pattern: Arrays and Hashing
Approach: Drop all numbers into a hashset. For each number, only start counting a sequence if (num - 1) is NOT in the set — that means it's the start of a sequence — then keep counting forward.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
