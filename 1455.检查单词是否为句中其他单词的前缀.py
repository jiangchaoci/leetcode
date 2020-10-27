#
# @lc app=leetcode.cn id=1455 lang=python3
#
# [1455] 检查单词是否为句中其他单词的前缀
#

# @lc code=start
class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        words = sentence.split(" ")
        res = -1
        for i in range(len(words)):
            if words[i].startswith(searchWord):
                res = i+1
                break
        return res
# @lc code=end

