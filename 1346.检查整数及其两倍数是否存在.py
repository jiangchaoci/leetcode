#
# @lc app=leetcode.cn id=1346 lang=python3
#
# [1346] 检查整数及其两倍数是否存在
#

# @lc code=start
class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        counter = collections.Counter(arr)
        for n in arr:
            if n != 0 and counter[2*n] >= 1:
                return True
            if n == 0 and counter[2*n] >= 2:
                return True
        return False
# @lc code=end

