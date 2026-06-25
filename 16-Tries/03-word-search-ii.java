/*
Problem: Word Search II (LeetCode 212)
Pattern: Tries
Approach: Build one Trie out of the entire word list first, then DFS every cell in the grid following Trie paths — this way overlapping prefixes get explored together instead of searching each word from scratch.
Time: O(m*n*4^L), bounded tighter by trie pruning | Space: O(total characters in the trie)
*/

// code goes here once solved
