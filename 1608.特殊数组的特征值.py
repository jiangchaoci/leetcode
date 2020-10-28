#
# @lc app=leetcode.cn id=1608 lang=python3
#
# [1608] 特殊数组的特征值
#

# @lc code=start
class Solution:
    def specialArray(self, nums: List[int]) -> int:
        count = [0] * 1001
        for num in nums:
            count[num] += 1
        for i in range(999, -1, -1):
            count[i] = count[i] + count[i+1]
        for i in range(1001):
            if i == count[i]:
                return i
        return -1
# @lc code=end

