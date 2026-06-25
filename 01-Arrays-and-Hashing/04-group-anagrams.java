/*
Problem: Group Anagrams (LeetCode 49)
Pattern: Arrays and Hashing
Approach: For every string build a key (sorted version of the string works, or a count of each letter), then group all strings with the same key together in a hashmap.
Time: O(n * k log k), k = avg string length | Space: O(n * k)
*/

// code goes here once solved
