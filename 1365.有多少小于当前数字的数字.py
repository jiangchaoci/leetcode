#
# @lc app=leetcode.cn id=1365 lang=python3
#
# [1365] 有多少小于当前数字的数字
#

# @lc code=start
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count = [0] * 101
        minCount = [0] * 101
        for i in range(len(nums)):
            count[nums[i]] += 1
        for i in range(1, 101):
            minCount[i] = minCount[i-1] + count[i-1]
        res = [0] * len(nums)
        for i in range(len(nums)):
            res[i] = minCount[nums[i]]
        return res
# @lc code=end

