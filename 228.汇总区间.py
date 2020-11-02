#
# @lc app=leetcode.cn id=228 lang=python3
#
# [228] 汇总区间
#

# @lc code=start
class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        nums.sort()
        beg = end = 0
        res = []
        while end < len(nums)-1:
            while end < len(nums)-1 and nums[end+1]-nums[end] == 1:
                end += 1
            if beg == end:
                res.append(str(nums[beg]))
            else:
                res.append(str(nums[beg]) + "->" + str(nums[end]))
            beg = end = end + 1
        if beg < len(nums):
            if beg == end:
                res.append(str(nums[beg]))
            else:
                res.append(str(nums[beg]) + "->" + str(nums[end]))
        return res
# @lc code=end

