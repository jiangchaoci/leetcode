#
# @lc app=leetcode.cn id=1460 lang=python3
#
# [1460] 通过翻转子数组使两个数组相等
#

# @lc code=start
class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        count1 = [0] * 1000
        count2 = [0] * 1000
        for i in range(len(target)):
            count1[target[i]-1] += 1
            count2[arr[i]-1] += 1
        for i in range(1000):
            if count1[i] != count2[i]:
                return False
        return True
# @lc code=end

