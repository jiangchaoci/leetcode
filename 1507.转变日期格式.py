#
# @lc app=leetcode.cn id=1507 lang=python3
#
# [1507] 转变日期格式
#

# @lc code=start
class Solution:
    def reformatDate(self, date: str) -> str:
        dict = {"Jan":"01", "Feb":"02", "Mar":"03", "Apr":"04", 
        "May":"05", "Jun":"06", "Jul":"07", "Aug":"08", 
        "Sep":"09", "Oct":"10", "Nov":"11", "Dec":"12"} 
        newDate = date.split(" ")
        day = newDate[0]
        month = newDate[1]
        year = newDate[2]
        res = ""
        res += year
        res += "-"
        res += dict[month]
        res += "-"
        if len(day) == 3:
            res += "0"
        res += day[0:(len(day)-2)]
        return res
# @lc code=end

