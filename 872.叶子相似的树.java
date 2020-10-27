import java.awt.List;

/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private void dfs(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            dfs(list, root.left);
            dfs(list, root.right);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(list1, root1);
        dfs(list2, root2);
        if (list1.size() != list2.size())
            return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }
        return true;
    }
}
// @lc code=end

