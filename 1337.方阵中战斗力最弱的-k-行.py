#
# @lc app=leetcode.cn id=1337 lang=python3
#
# [1337] 方阵中战斗力最弱的 K 行
#

# @lc code=start
class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        res = [[i, 0] for i in range(len(mat))]
        for i in range(len(mat)):
            count = 0
            for j in range(len(mat[i])):
                if mat[i][j] == 1:
                    count+=1
                else:
                    break
            
            res[i][1] = count
        res.sort(key=lambda x:x[1])
        res1 = [0 for i in range(k)]
        for i in range(k):
            res1[i] = res[i][0]
        return res1

# @lc code=end

