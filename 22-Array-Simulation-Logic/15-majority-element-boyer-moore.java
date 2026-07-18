/*
Problem: Majority Element - Boyer-Moore Voting (LeetCode 169)
Pattern: Array Simulation / In-place Logic
Approach: No hashmap counting needed. Maintain a candidate and a counter. If counter hits 0, pick the current element as the new candidate. Increment counter if the current element matches the candidate, decrement otherwise. The surviving candidate at the end is guaranteed to be the majority element (only works because a majority element is guaranteed to exist by problem constraints).
Time: O(n) | Space: O(1)
*/

// code goes here once solved
