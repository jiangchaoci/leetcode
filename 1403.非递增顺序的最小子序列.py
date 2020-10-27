#
# @lc app=leetcode.cn id=1403 lang=python3
#
# [1403] 非递增顺序的最小子序列
#

# @lc code=start
class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)
        sum = 0
        for num in nums:
            sum += num
        cur = 0
        res = []
        for num in nums:
            cur += num
            res.append(num)
            remain = sum - cur
            if cur > remain:
                break
        return res
# @lc code=end

