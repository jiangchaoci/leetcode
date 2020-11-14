#
# @lc app=leetcode.cn id=1560 lang=python3
#
# [1560] 圆形赛道上经过次数最多的扇区
#

# @lc code=start
class Solution:
    def mostVisited(self, n: int, rounds: List[int]) -> List[int]:
        res = []
        start = rounds[0]
        end = rounds[len(rounds)-1]
        while start != end:
            res.append(start)
            start = start + 1
            if start > n:
                start = 1
        res.append(end)
        res.sort()
        return res
# @lc code=end

