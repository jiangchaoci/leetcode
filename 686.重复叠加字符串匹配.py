#
# @lc app=leetcode.cn id=686 lang=python3
#
# [686] 重复叠加字符串匹配
#

# @lc code=start
class Solution:
    def repeatedStringMatch(self, A: str, B: str) -> int:
        lenA = len(A)
        lenB = len(B)
        repeatA = A
        repeatNum = lenB // lenA + 2
        count = 1
        while count <= repeatNum:
            if B in repeatA:
                return count
            count += 1
            repeatA += A
        return -1
# @lc code=end

