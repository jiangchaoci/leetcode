#
# @lc app=leetcode.cn id=1360 lang=python3
#
# [1360] 日期之间隔几天
#

# @lc code=start
class Solution:
    def daysBetweenDates(self, date1: str, date2: str) -> int:
        maxDate = minDate = ""
        if (date1 >= date2):
            maxDate = date1
            minDate = date2
        else:
            maxDate = date2
            minDate = date1
        year1 = int(maxDate[:4])
        year2 = int(minDate[:4])
        
# @lc code=end

