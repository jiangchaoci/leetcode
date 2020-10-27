import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left != null && right != null) {
            if (left.val != right.val) return false;
            return helper(left.left, right.right) && helper(left.right, right.left);
        } else return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }
}
// @lc code=end

