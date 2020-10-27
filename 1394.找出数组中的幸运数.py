#
# @lc app=leetcode.cn id=1394 lang=python3
#
# [1394] 找出数组中的幸运数
#

# @lc code=start
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        count = [0] * 500
        for i in range(len(arr)):
            count[arr[i]-1] += 1
        for i in range(499, -1, -1):
            if count[i] == i+1:
                return i+1
        return -1
# @lc code=end

