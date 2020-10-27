/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
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

    private int postorder(TreeNode root) {
        if (root == null) return 0;
        int leftSum = postorder(root.left);
        int rightSum = postorder(root.right);
        res += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }

    public int findTilt(TreeNode root) {
        postorder(root);
        return res;
    }
}
// @lc code=end

