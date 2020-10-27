#
# @lc app=leetcode.cn id=1380 lang=python3
#
# [1380] 矩阵中的幸运数
#

# @lc code=start
class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        rowMin = [-1] * m
        colMin = [-1] * n
        for i in range(m):
            minIdx = 0
            minNum = matrix[i][0]
            for j in range(1, n):
                if matrix[i][j] < minNum:
                    minNum = matrix[i][j]
                    minIdx = j
            rowMin[i] = minIdx

        for j in range(n):
            minIdx = 0
            minNum = matrix[0][j]
            for i in range(1, m):
                if matrix[i][j] > minNum:
                    minNum = matrix[i][j]
                    minIdx = i
            colMin[j] = minIdx
        
        res = []
        for i in range(m):
            if colMin[rowMin[i]] == i:
                res.append(matrix[i][rowMin[i]])
        return res
# @lc code=end

