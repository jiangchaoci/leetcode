/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            if (!words[i].equals("")) {
                if (res.length() != 0)
                    res.append(" ");
                res.append(words[i]);
            }
        }
        return res.toString();
    }
}
// @lc code=end

