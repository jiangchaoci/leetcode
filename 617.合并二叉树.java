import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            if (t2 == null) return null;
            else return t2;
        } else {
            if (t2 == null) return t1;
            else {
                TreeNode root = new TreeNode(t1.val + t2.val);
                root.left = mergeTrees(t1.left, t2.left);
                root.right = mergeTrees(t1.right, t2.right);
                return root;
            }
        }
    }
}
// @lc code=end

