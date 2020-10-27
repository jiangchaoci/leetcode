#
# @lc app=leetcode.cn id=1370 lang=python3
#
# [1370] 上升下降字符串
#

# @lc code=start
class Solution:
    def sortString(self, s: str) -> str:
        zimu = "abcdefghijklmnopqrstuvwxyz"
        count = [0] * 26
        num = len(s)
        for i in range(num):
            count[ord(s[i]) - ord('a')] += 1
        res = ""
        while num > 0:
            for i in range(26):
                if count[i] > 0:
                    res += zimu[i]
                    count[i] -= 1
                    num -= 1
            for i in range(25, -1, -1):
                if count[i] > 0:
                    res += zimu[i]
                    count[i] -= 1
                    num -= 1
        return res
       
# @lc code=end

