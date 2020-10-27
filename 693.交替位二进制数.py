#
# @lc app=leetcode.cn id=693 lang=python3
#
# [693] 交替位二进制数
#

# @lc code=start
class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        flag = n % 2
        while n > 0:
            next = n % 2
            if next != flag:
                return False
            n = n // 2
            if flag == 1:
                flag = 0
            else:
                flag = 1
        return True
# @lc code=end

