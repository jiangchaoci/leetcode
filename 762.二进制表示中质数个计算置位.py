#
# @lc app=leetcode.cn id=762 lang=python3
#
# [762] 二进制表示中质数个计算置位
#

# @lc code=start
class Solution:
    def countOne(self, num: int) -> int:
        res = 0
        while num > 0:
            num &= (num - 1)
            res += 1
        return res

    def isZhi(self, num: int) -> bool:
        if num == 1:
            return False
        if num == 2:
            return True
        if num & 1 == 0:
            return False
        i = 3
        while i*i <= num:
            if num % i == 0:
                return False
            i += 2
        return True

    def countPrimeSetBits(self, L: int, R: int) -> int:
        res = 0
        for i in range(L, R+1):
            temp = self.countOne(i)
            if self.isZhi(temp):
                res += 1
        return res
        
# @lc code=end

