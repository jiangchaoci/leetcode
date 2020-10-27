/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
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
    private boolean helper(TreeNode root, int val) {
        if (root == null)
            return true;
        if (root.val != val)
            return false;
        return helper(root.left, val) && helper(root.right, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return true;
        return helper(root, root.val);
    }
}
// @lc code=end

