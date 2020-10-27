#
# @lc app=leetcode.cn id=1422 lang=python3
#
# [1422] 分割字符串的最大得分
#

# @lc code=start
class Solution:
    def maxScore(self, s: str) -> int:
        left = 0
        right = 0
        if s[0] == '0':
            left = 1
        for i in range(1, len(s)):
            if s[i] == '1':
                right += 1
        res = left + right
        for i in range(1, len(s)-1):
            if s[i] == '0':
                left += 1
            else:
                right -= 1
            res = max(res, left+right)
        return res
# @lc code=end

