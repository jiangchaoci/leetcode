#
# @lc app=leetcode.cn id=697 lang=python3
#
# [697] 数组的度
#

# @lc code=start
class Solution:
    def findShortestSubArray(self, nums: List[int]) -> int:
        map = {}
        for num in nums:
            if num in map:
                map[num] = map[num] + 1
            else:
                map[num] = 1
        count = 0
        for val in map.values():
            if val > count:
                count = val
        maxValue = []
        for k, v in map.items():
            if v == count:
                maxValue.append(k)
        res = len(nums)
        revNums = list(nums)
        revNums.reverse()
        numsLen = len(nums)
        for k in maxValue:
            first = nums.index(k)
            last = revNums.index(k)
            if numsLen - first - last < res:
                res = numsLen - first - last
        return res
# @lc code=end

