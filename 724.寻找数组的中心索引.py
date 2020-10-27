#
# @lc app=leetcode.cn id=724 lang=python3
#
# [724] 寻找数组的中心索引
#

# @lc code=start
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return -1
        if len(nums) == 1:
            return 0
        sum = 0
        for num in nums:
            sum += num
        if sum - nums[0] == 0:
            return 0
        bef = 0
        aft = sum - nums[0]
        for i in range(1, len(nums)):
            bef += nums[i-1]
            aft -= nums[i]
            if bef == aft:
                return i
            
        return -1
# @lc code=end

