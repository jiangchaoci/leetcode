/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根到叶子节点数字之和
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
    private void preorder(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;
        sb.append(String.valueOf(root.val));
        if (root.left == null && root.right == null) {
            res += Integer.valueOf(sb.toString());
        } else {
            preorder(root.left, sb);
            preorder(root.right, sb);
        }
        sb.delete(sb.length()-1, sb.length());
    }
    public int sumNumbers(TreeNode root) {
        preorder(root, new StringBuilder());
        return res;
    }
}
// @lc code=end

