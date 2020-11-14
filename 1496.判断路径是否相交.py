#
# @lc app=leetcode.cn id=1496 lang=python3
#
# [1496] 判断路径是否相交
#

# @lc code=start
class Solution:
    def isPathCrossing(self, path: str) -> bool:
        dict = {}
        curX = curY = 0
        dict[str(curX)+':'+str(curY)] = 1
        for i in range(len(path)):
            if path[i] == 'N':
                curY += 1
                if (str(curX)+':'+str(curY)) in dict:
                    return True
            elif path[i] == 'S':
                curY -= 1
                if (str(curX)+':'+str(curY)) in dict:
                    return True
            elif path[i] == 'E':
                curX += 1
                if (str(curX)+':'+str(curY)) in dict:
                    return True
            else:
                curX -= 1
                if (str(curX)+':'+str(curY)) in dict:
                    return True
            dict[str(curX)+':'+str(curY)] = 1
        return False
# @lc code=end

