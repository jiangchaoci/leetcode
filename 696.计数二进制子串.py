#
# @lc app=leetcode.cn id=696 lang=python3
#
# [696] 计数二进制子串
#

# @lc code=start
class Solution:
    def countBinarySubstrings(self, s: str) -> int:
        res, prev, cur = 0, 0, 1
        for i in range(1, len(s)):
            if s[i-1] != s[i]:
                res += min(prev, cur)
                prev, cur = cur, 1
            else:
                cur += 1

        return res + min(prev, cur)

# @lc code=end

