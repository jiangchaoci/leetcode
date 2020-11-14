#
# @lc app=leetcode.cn id=1523 lang=python3
#
# [1523] 在区间范围内统计奇数数目
#

# @lc code=start
class Solution:
    def countOdds(self, low: int, high: int) -> int:
        res = 0
        if low % 2 == 0 and high % 2 == 0:
            res = (high - low) // 2
        else:
            res = (high - low) // 2 + 1
        return res
# @lc code=end

