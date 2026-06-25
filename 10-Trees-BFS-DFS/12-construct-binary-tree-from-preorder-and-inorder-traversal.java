/*
Problem: Construct Binary Tree from Preorder and Inorder Traversal (LeetCode 105)
Pattern: Trees (BFS/DFS)
Approach: First element of preorder is always the root. Find that value in inorder to know how many elements belong to the left subtree vs right subtree, then recurse on each half.
Time: O(n) | Space: O(n)
*/

// code goes here once solved
