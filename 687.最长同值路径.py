#
# @lc app=leetcode.cn id=687 lang=python3
#
# [687] 最长同值路径
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    ans = 0
    def helper(self, root: TreeNode) -> int:
        if root == None:
            return 0
        left_length = self.helper(root.left)
        right_length = self.helper(root.right)

        left = 0
        right = 0
        if root.left != None and root.val == root.left.val:
            left = 1 + left_length
        if root.right != None and root.val == root.right.val:
            right = 1 + right_length
        self.ans = max(self.ans, left + right)
        return max(left, right)

    def longestUnivaluePath(self, root: TreeNode) -> int:
        self.helper(root)
        return self.ans
        
# @lc code=end

