#
# @lc app=leetcode.cn id=6 lang=python3
#
# [6] Z 字形变换
#

# @lc code=start
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        res = ''
        rows = ['' for i in range(numRows)]
        index = 0
        add = 1
        for i in range(len(s)):
            rows[index] += s[i]
            if index == numRows - 1:
                add = -1
            if index == 0:
                add = 1
            index += add
        for i in range(len(rows)):
            res += rows[i]
        return res
# @lc code=end

