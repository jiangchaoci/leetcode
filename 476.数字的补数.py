#
# @lc app=leetcode.cn id=476 lang=python3
#
# [476] 数字的补数
#

# @lc code=start
class Solution:
    def findComplement(self, num: int) -> int:
        if num == 0:
            return 1
        temp = []
        while num > 0:
            temp.append(num%2)
            num >>= 1
        for i in range(len(temp)):
            temp [i] = 1 - temp[i]
        res = 0
        index = 1
        for i in range(len(temp)):
            res += temp[i] * index
            index *= 2
        return res
# @lc code=end

