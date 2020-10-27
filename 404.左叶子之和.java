import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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

    private int helper(TreeNode root, boolean flag) {
        if (root == null) return 0;
        if (flag && root.left == null && root.right == null) return root.val;
        int leftNum = helper(root.left, true);
        int rightNum = helper(root.right, false);
        return leftNum + rightNum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);
    }
}
// @lc code=end

