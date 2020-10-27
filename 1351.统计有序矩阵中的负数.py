#
# @lc app=leetcode.cn id=1351 lang=python3
#
# [1351] 统计有序矩阵中的负数
#

# @lc code=start
class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m = len(grid)
        if m == 0:
            return 0
        n = len(grid[0])
        i = m - 1
        j = 0
        res = 0
        while i >= 0 and j < n:
            if grid[i][j] < 0:
                res += n - j
                i -= 1
            else:
                j += 1
        return res
# @lc code=end

