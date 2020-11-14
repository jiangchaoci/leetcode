#
# @lc app=leetcode.cn id=401 lang=python3
#
# [401] 二进制手表
#

# @lc code=start
import math
class Solution:
    def countOne(self, num: int) -> int:
        res = 0
        while num > 0:
            num = num & (num-1)
            res += 1
        return res

    def readBinaryWatch(self, num: int) -> List[str]:
        res = []
        for i in range(12):
            for j in range(60):
                if self.countOne(i) + self.countOne(j) == num:
                    minute = ("%02d") % (j)
                    res.append(str(i) + ":" + minute)
        return res
        
# @lc code=end

