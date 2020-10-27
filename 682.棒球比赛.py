#
# @lc app=leetcode.cn id=682 lang=python3
#
# [682] 棒球比赛
#

# @lc code=start
class Solution:
    def calPoints(self, ops: List[str]) -> int:
        stack = []
        for o in ops:
            if o == '+':
                stack.append(stack[-1] + stack[-2])
            elif o == 'D':
                stack.append(stack[-1] * 2)
            elif o == 'C':
                stack.pop()
            else:
                stack.append(int(o))
                pre = int(o)

        sum = 0
        for i in stack:
            sum += i
        
        return sum
# @lc code=end

