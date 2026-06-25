/*
Problem: Word Ladder (LeetCode 127)
Pattern: Graphs (BFS/DFS on Grid + General)
Approach: BFS where every word is a node. Generate neighbors by changing one letter at a time and checking if that new word exists in the word set — BFS naturally finds the shortest transformation chain.
Time: O(n * 26 * L), L = word length | Space: O(n * L)
*/

// code goes here once solved
