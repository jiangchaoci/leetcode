#
# @lc app=leetcode.cn id=1399 lang=python3
#
# [1399] 统计最大组的数目
#

# @lc code=start
class Solution:
    def countSum(self, n: int) -> int:
        res = 0
        while n > 0:
            res += n % 10
            n //= 10
        return res

    def countLargestGroup(self, n: int) -> int:
        dict = {}
        for i in range(1, n+1):
            temp = self.countSum(i)
            if temp not in dict:
                dict[temp] = 1
            else:
                dict[temp] = dict[temp] + 1

        res = 0
        maxCount = 0
        for value in dict.values():
            if value > maxCount:
                maxCount = value
                res = 1
            elif value == maxCount:
                res += 1
        return res
# @lc code=end

