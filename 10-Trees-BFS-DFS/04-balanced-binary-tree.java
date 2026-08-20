/*
Problem: Balanced Binary Tree (LeetCode 110)
Link: https://leetcode.com/problems/balanced-binary-tree/description/
Pattern: Trees (BFS/DFS)
Approach: DFS that returns the height of a subtree, but bail out early (return a sentinel value like -1) the moment any subtree is found to be unbalanced, instead of finishing the whole traversal.
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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }
    private int height(TreeNode root){
        if(root == null) return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);
        if(Math.abs(lheight - rheight) > 1){
            flag = false;
        }
        int theight = Math.max(lheight,rheight)+1;
        return theight;
    }
}
