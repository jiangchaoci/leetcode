#
# @lc app=leetcode.cn id=1598 lang=python3
#
# [1598] 文件夹操作日志搜集器
#

# @lc code=start
class Solution:
    def minOperations(self, logs: List[str]) -> int:
        cur = 0
        for log in logs:
            if log == "./":
                pass
            elif log == "../":
                cur = max(0, cur-1)
            else:
                cur += 1
        return cur
# @lc code=end

