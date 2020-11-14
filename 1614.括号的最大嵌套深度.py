#
# @lc app=leetcode.cn id=1614 lang=python3
#
# [1614] 括号的最大嵌套深度
#

# @lc code=start
class Solution:
    def maxDepth(self, s: str) -> int:
        res = 0
        cur = 0
        for i in range(len(s)):
            if s[i] == "(":
                cur += 1
                res = max(res, cur)
            elif s[i] == ")":
                cur -= 1
        return res
# @lc code=end

