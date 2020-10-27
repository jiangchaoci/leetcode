#
# @lc app=leetcode.cn id=728 lang=python3
#
# [728] 自除数
#

# @lc code=start
class Solution:
    def check(self, num) -> bool:
        if num < 10:
            return True
        num1 = num
        while num1 > 0:
            div = num1 % 10
            if div == 0:
                return False
            if num % div != 0:
                return False
            num1 = num1 // 10
        return True

    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        res = []
        for i in range(left, right+1):
            if self.check(i):
                res.append(i)
        return res
        
# @lc code=end

