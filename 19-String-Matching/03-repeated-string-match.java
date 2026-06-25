/*
Problem: Repeated String Match (LeetCode 686)
Pattern: String Matching (KMP / Rabin-Karp)
Approach: Figure out the minimum number of times you'd need to repeat string a so it's at least as long as b, then check if b is a substring of that repeated string (plus one extra repeat just in case, for edge cases).
Time: O(n*m) roughly | Space: O(n*m) for the repeated string
*/

// code goes here once solved
