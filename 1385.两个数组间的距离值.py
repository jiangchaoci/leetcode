#
# @lc app=leetcode.cn id=1385 lang=python3
#
# [1385] 两个数组间的距离值
#

# @lc code=start
class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        count = [0] * 2001
        for i in range(len(arr2)):
            count[arr2[i]+1000] += 1
        res = 0
        for i in range(len(arr1)):
            flag = True
            for j in range(-d, d+1):
                idx = arr1[i]+1000+j
                if idx >=0 and idx < len(count) and count[idx] > 0:
                    flag = False
                    break
            if flag:
                res += 1
        return res
# @lc code=end

