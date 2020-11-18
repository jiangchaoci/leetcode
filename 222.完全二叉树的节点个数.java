/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int res = 0;
    private void inorder(TreeNode root) {
        if (root == null) 
            return;
        res ++;
        inorder(root.left);
        inorder(root.right);
    }
    public int countNodes(TreeNode root) {
        inorder(root);
        return res;
    }
}
// @lc code=end

