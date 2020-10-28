#
# @lc app=leetcode.cn id=1544 lang=python3
#
# [1544] 整理字符串
#

# @lc code=start
class Solution:
    def makeGood(self, s: str) -> str:
        changed = True
        while changed:
            changed = False
            for i in range(len(s)-1):
                if s[i].islower():
                    if s[i+1].isupper() and s[i] == s[i+1].lower():
                        changed = True
                        s = s[0:i] + s[i+2:len(s)]
                        break
                else:
                    if s[i+1].islower() and s[i] == s[i+1].upper():
                        changed = True
                        s = s[0:i] + s[i+2:len(s)]
                        break
        return s
# @lc code=end

