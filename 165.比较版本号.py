#
# @lc app=leetcode.cn id=165 lang=python3
#
# [165] 比较版本号
#

# @lc code=start
class Solution:
    def delZero(self, ver: str) -> str:
        p = 0
        while p < len(ver):
            if ver[p] == '0':
                p += 1
            else:
                break
        if p == len(ver):
            return '0'
        else:
            return ver[p:len(ver)]

    def compareVersion(self, version1: str, version2: str) -> int:
        ver1 = version1.split('.')
        ver2 = version2.split('.')
        for i in range(len(ver1)):
            ver1[i] = self.delZero(ver1[i])
        for i in range(len(ver2)):
            ver2[i] = self.delZero(ver2[i])
        p = 0
        q = 0
        while p < len(ver1) and q < len(ver2):
            if int(ver1[p]) > int(ver2[q]):
                return 1
            elif int(ver1[p]) < int(ver2[q]):
                return -1
            else:
                p += 1
                q += 1
        if p < len(ver1):
            for i in range(p, len(ver1)):
                if ver1[i] > '0':
                    return 1
        elif q < len(ver2):
            for i in range(q, len(ver2)):
                if ver2[i] > '0':
                    return -1
        return 0
# @lc code=end

