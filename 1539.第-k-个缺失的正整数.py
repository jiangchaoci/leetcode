#
# @lc app=leetcode.cn id=1539 lang=python3
#
# [1539] 第 k 个缺失的正整数
#

# @lc code=start
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        cur = 1
        p = 0
        miss = []
        while p < len(arr):
            if arr[p] == cur:
                p += 1
                cur += 1
            else:
                miss.append(cur)
                cur += 1
                k -= 1
                if k == 0:
                    return miss[len(miss)-1]
        while k > 0:
            miss.append(cur)
            cur += 1
            k -= 1
        return miss[len(miss)-1]
# @lc code=end

