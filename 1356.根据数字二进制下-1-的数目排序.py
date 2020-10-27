#
# @lc app=leetcode.cn id=1356 lang=python3
#
# [1356] 根据数字二进制下 1 的数目排序
#

# @lc code=start
class Solution:
    def countBinary(self, num : int) -> int:
        res = 0
        while num > 0:
            num &= (num-1)
            res += 1
        return res

    def sortByBits(self, arr: List[int]) -> List[int]:
        arr.sort()
        temp = [[0, 0] for i in range(len(arr))]
        for i in range(len(arr)):
            temp[i][0] = arr[i]
            temp[i][1] = self.countBinary(arr[i])
        temp.sort(key = lambda x:x[1])
        res = [0] * len(arr)
        for i in range(len(arr)):
            res[i] = temp[i][0]
        return res

# @lc code=end

