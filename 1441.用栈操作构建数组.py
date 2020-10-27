#
# @lc app=leetcode.cn id=1441 lang=python3
#
# [1441] 用栈操作构建数组
#

# @lc code=start
class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        p = 0
        q = 1
        res = []
        while p < len(target) and q <= n:
            res.append("Push")
            if target[p] != q:
                res.append("Pop")
                p -= 1
            p += 1
            q += 1
        return res

# @lc code=end

