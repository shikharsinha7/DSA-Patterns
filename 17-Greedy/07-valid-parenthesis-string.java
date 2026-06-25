/*
Problem: Valid Parenthesis String (LeetCode 678)
Pattern: Greedy
Approach: Track a range [low, high] of how many open brackets you could possibly have, treating each '*' as either '(' or ')' or nothing — shrink and grow that range as you scan through.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
