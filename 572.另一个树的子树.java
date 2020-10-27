import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType;

/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一个树的子树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) 
            return true;
        else if (s != null && t != null) {
            return s.val == t.val && isSame(s.left, t.left)
                && isSame(s.right, t.right);
        } else
            return false;
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(s);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (isSame(node, t))
                return true;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return false;
    }
}
// @lc code=end

