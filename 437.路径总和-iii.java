/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
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
    private int helper(TreeNode root, int sum) {
        if (root == null) return 0;
        int ans = 0;
        if (root.val == sum) ans++;
        return ans + helper(root.left, sum - root.val) + helper(root.right, sum - root.val);
    }
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSum(root.left, sum) + pathSum(root.right, sum) + helper(root, sum);
    }
}
// @lc code=end

