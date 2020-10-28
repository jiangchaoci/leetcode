#
# @lc app=leetcode.cn id=1486 lang=python3
#
# [1486] 数组异或操作
#

# @lc code=start
class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        nums = [0] * n
        for i in range(n):
            nums[i] = start + 2*i
        res = 0
        for num in nums:
            res ^= num
        return res
# @lc code=end

