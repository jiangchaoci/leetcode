#
# @lc app=leetcode.cn id=1436 lang=python3
#
# [1436] 旅行终点站
#

# @lc code=start
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        out = {}
        for path in paths:
            cityA = path[0]
            cityB = path[1]
            out[cityA] = 1
            if cityB not in out:
                out[cityB] = 0
        res = ""
        for key in out.keys():
            if out[key] == 0:
                res = key
                break
        return res
# @lc code=end

