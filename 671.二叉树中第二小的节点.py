#
# @lc app=leetcode.cn id=671 lang=python3
#
# [671] 二叉树中第二小的节点
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    nums = set()
    def preorder(self, root: TreeNode):
        if root == None:
            return
        self.nums.add(root.val)
        self.preorder(root.left)
        self.preorder(root.right)

    def findSecondMinimumValue(self, root: TreeNode) -> int:
        self.nums = set()
        self.preorder(root)
        minNum = min(self.nums)
        self.nums.remove(minNum)
        if len(self.nums) > 0:
            return min(self.nums)
        else:
            return -1
            
# @lc code=end

