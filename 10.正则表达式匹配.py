#
# @lc app=leetcode.cn id=10 lang=python3
#
# [10] 正则表达式匹配
#

# @lc code=start
class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        m = len(s)
        n = len(p)
        #dp = [[False] * (n+1)] * (m+1)
        dp = [[False] * (n+1) for _ in range(m+1)]
        dp[0][0] = True
        def match(i: int, j: int) -> bool:
            if i == 0:
                return False
            if p[j-1] == '.':
                return True
            return s[i-1] == p[j-1]
        for i in range(0, m+1):
            for j in range(1, n+1):
                if p[j-1] == '*':
                    if match(i, j-1):
                        dp[i][j] = dp[i][j] or dp[i-1][j]
                    dp[i][j] = dp[i][j] or dp[i][j-2]
                else: 
                    if match(i, j):
                        dp[i][j] = dp[i][j] or dp[i-1][j-1]
        return dp[m][n]

# @lc code=end

