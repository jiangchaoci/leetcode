import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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

    private int height(TreeNode root) {
        if (root == null) return 0;
        else return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else return Math.abs(height(root.left)-height(root.right)) < 2
            && isBalanced(root.left)
            && isBalanced(root.right);
    }
}
// @lc code=end

