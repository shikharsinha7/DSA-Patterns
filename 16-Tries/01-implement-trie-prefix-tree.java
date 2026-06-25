/*
Problem: Implement Trie (Prefix Tree) (LeetCode 208)
Pattern: Tries
Approach: Each node holds an array/map of children (one per letter) plus a flag for 'a word ends here'. Insert and search both just walk character by character, creating nodes as needed.
Time: O(L) per operation, L = word length | Space: O(total characters across all inserted words)
*/

// code goes here once solved
