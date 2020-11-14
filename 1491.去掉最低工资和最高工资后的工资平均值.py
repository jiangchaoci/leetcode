#
# @lc app=leetcode.cn id=1491 lang=python3
#
# [1491] 去掉最低工资和最高工资后的工资平均值
#

# @lc code=start
class Solution:
    def average(self, salary: List[int]) -> float:
        sum = maxS = 0
        minS = 1000001
        for sa in salary:
            sum += sa
            if sa > maxS:
                maxS = sa
            if sa < minS:
                minS = sa
        sum -= maxS
        sum -= minS
        return sum / (len(salary)-2)
# @lc code=end

