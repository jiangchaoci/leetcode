#
# @lc app=leetcode.cn id=1374 lang=python3
#
# [1374] 生成每种字符都是奇数个的字符串
#

# @lc code=start
class Solution:
    def generateTheString(self, n: int) -> str:
        res = ""
        if n % 2 == 1:
            res = "a" * n
        else:
            res = "a" * (n-1) + "b"
        return res
# @lc code=end

