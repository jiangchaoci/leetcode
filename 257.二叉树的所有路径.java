import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    private List<String> ans = new ArrayList<String>();

    private void dfs(String str, TreeNode node) {
        if (node.left == null && node.right == null) {
            String temp = str + "->" + node.val;
            ans.add(temp.substring(2, temp.length()));
            return;
        }
        if (node.left != null) dfs(str + "->" + node.val, node.left);
        if (node.right != null) dfs(str + "->" + node.val, node.right);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return ans;
        dfs("", root);
        return ans;
    }
}
// @lc code=end

