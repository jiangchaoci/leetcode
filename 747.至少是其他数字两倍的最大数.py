#
# @lc app=leetcode.cn id=747 lang=python3
#
# [747] 至少是其他数字两倍的最大数
#

# @lc code=start
class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        first = -1
        second = -1
        index = 0
        for i in range(len(nums)):
            if nums[i] >= first:
                second = first
                first = nums[i]
                index = i
            elif nums[i] >= second:
                second = nums[i]
        if first >= second * 2:
            return index
        return -1
# @lc code=end

