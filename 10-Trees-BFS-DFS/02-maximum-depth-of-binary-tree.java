/*
Problem: Maximum Depth of Binary Tree (LeetCode 104)
Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
Pattern: Trees (BFS/DFS)
Approach: Recursively return 1 + the bigger of (depth of left subtree, depth of right subtree). A null node returns 0.
Time: O(n) | Space: O(h)
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);
        int td = Math.max(ld,rd)+1;
        return td;
    }
}
