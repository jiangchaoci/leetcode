#
# @lc app=leetcode.cn id=1566 lang=python3
#
# [1566] 重复至少 K 次且长度为 M 的模式
#

# @lc code=start
class Solution:
    def containsPattern(self, arr: List[int], m: int, k: int) -> bool:
        for i in range(len(arr)-m*k+1):
            temp = arr[i:i+m] * k
            flag = True
            for j in range(m*k):
                if arr[i+j] != temp[j]:
                    flag = False
                    break
            if flag:
                return flag
        return False
# @lc code=end

