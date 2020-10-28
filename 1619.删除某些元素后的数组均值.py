#
# @lc app=leetcode.cn id=1619 lang=python3
#
# [1619] 删除某些元素后的数组均值
#

# @lc code=start
class Solution:
    def trimMean(self, arr: List[int]) -> float:
        cut = len(arr) // 20
        sum = 0
        arr.sort()
        for i in range(cut, len(arr)-cut):
            sum += arr[i]
        return sum / (len(arr) - 2*cut)
# @lc code=end

