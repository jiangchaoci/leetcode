#
# @lc app=leetcode.cn id=680 lang=python3
#
# [680] 验证回文字符串 Ⅱ
#

# @lc code=start
class Solution:
    def isPalin(self, s: str, i: int, j: int) -> bool:
        if i > j:
            return False
        while i < j:
            if s[i] == s[j]:
                pass
            else:
                return False
            i+=1
            j-=1
        return True
    def validPalindrome(self, s: str) -> bool:
        if self.isPalin(s, 0, len(s)-1):
            return True
        l = 0
        r = len(s)-1
        while l < r:
            if s[l] != s[r]:
                break
            l+=1
            r-=1
        return self.isPalin(s, l+1, r) or self.isPalin(s, l, r-1)
# @lc code=end

