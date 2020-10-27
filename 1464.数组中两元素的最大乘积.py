#
# @lc app=leetcode.cn id=1464 lang=python3
#
# [1464] 数组中两元素的最大乘积
#

# @lc code=start
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        first = 0
        second = 0
        for num in nums:
            if num >= first:
                second = first
                first = num
            elif num > second:
                second = num
        return (first-1) * (second-1)
# @lc code=end

