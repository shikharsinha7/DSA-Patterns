/*
Problem: Subarray Sum Equals K (LeetCode 560)
Pattern: Prefix Sum + HashMap
Approach: Keep a running prefix sum as you go, and store how many times each prefix sum value has occurred in a hashmap. At each step check if (currentSum - k) has occurred before — if yes, add that count to the answer.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
