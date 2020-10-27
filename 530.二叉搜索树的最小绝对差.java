import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
    /*private List<Integer> list = new ArrayList<>();

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        dfs(root);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            res = Math.min(res, list.get(i) - list.get(i - 1));
        }
        return res;
    }*/

    TreeNode pre = null;
    int min = Integer.MAX_VALUE;

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (pre != null)
            min = Math.min(min, root.val - pre.val);
        pre = root;
        inorder(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
}
// @lc code=end

