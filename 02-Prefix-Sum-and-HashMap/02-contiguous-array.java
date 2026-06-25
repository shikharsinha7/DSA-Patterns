/*
Problem: Contiguous Array (LeetCode 525)
Pattern: Prefix Sum + HashMap
Approach: Treat every 0 as -1 and every 1 as +1, track running sum. Store the first index where each running sum value showed up in a hashmap — if the same sum shows up again, the chunk in between has equal 0s and 1s.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
