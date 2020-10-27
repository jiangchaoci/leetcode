import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
    }
}
// @lc code=end

