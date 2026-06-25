/*
Problem: Surrounded Regions (LeetCode 130)
Pattern: Graphs (BFS/DFS on Grid + General)
Approach: Run DFS/BFS starting from every 'O' on the border first to mark which regions are actually safe (connected to the edge). Anything still marked 'O' afterward gets flipped to 'X'.
Time: O(m*n) | Space: O(m*n)
*/

// code goes here once solved
