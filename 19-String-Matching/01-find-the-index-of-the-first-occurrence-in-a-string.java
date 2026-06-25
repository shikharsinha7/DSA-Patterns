/*
Problem: Find the Index of the First Occurrence in a String (LeetCode 28)
Pattern: String Matching (KMP / Rabin-Karp)
Approach: This is literally implementing strStr(). The brute force way checks every starting position (O(n*m)), but KMP's failure function gets it down to O(n+m) by skipping re-checks on partial matches.
Time: O(n+m) with KMP | Space: O(m) for the prefix/failure table
*/

// code goes here once solved
