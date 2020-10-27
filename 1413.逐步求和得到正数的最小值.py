#
# @lc app=leetcode.cn id=1413 lang=python3
#
# [1413] 逐步求和得到正数的最小值
#

# @lc code=start
class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        res = 1
        for i in range(len(nums)):
            if i > 0:
                nums[i] = nums[i-1] + nums[i]
            res = max(res, 1-nums[i])
        return res
        
# @lc code=end

