#
# @lc app=leetcode.cn id=1446 lang=python3
#
# [1446] 连续字符
#

# @lc code=start
class Solution:
    def maxPower(self, s: str) -> int:
        res = 1
        cur = 1
        for i in range(1, len(s)):
            if s[i] == s[i-1]:
                cur += 1
            else:
                res = max(res, cur)
                cur = 1
        res = max(res, cur)
        return res
# @lc code=end

