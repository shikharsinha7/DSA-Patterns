/*
Problem: Design Add and Search Words Data Structure (LeetCode 211)
Pattern: Tries
Approach: Same Trie structure as above, but search needs to support '.' as a wildcard — which means branching into every child at that position with DFS instead of following one fixed path.
Time: O(L) for add, O(26^L) worst case for search with wildcards | Space: O(total characters)
*/

// code goes here once solved
