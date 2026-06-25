/*
Problem: Capacity To Ship Packages Within D Days (LeetCode 1011)
Pattern: Binary Search
Approach: Binary search on the ship's capacity (from the heaviest single package up to the sum of all weights). For each candidate capacity, greedily check how many days it'd take, and find the smallest capacity that fits within D days.
Time: O(n log(sum of weights)) | Space: O(1)
*/

// code goes here once solved
