#
# @lc app=leetcode.cn id=1417 lang=python3
#
# [1417] 重新格式化字符串
#

# @lc code=start
class Solution:
    def reformat(self, s: str) -> str:
        words = ""
        nums = ""
        for i in range(len(s)):
            if s[i].isdigit():
                nums += s[i]
            else:
                words += s[i]
        maxStr = ""
        minStr = ""
        if abs(len(words)-len(nums)) > 1:
            return ""
        if len(words) >= len(nums):
            maxStr = words
            minStr = nums
        else:
            maxStr = nums
            minStr = words
        res = ""
        for i in range(len(minStr)):
            res += maxStr[i]
            res += minStr[i]
        if (len(maxStr) > len(minStr)):
            res += maxStr[len(minStr)]
        return res
# @lc code=end

