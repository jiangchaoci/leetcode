/*
 * @lc app=leetcode.cn id=1309 lang=java
 *
 * [1309] 解码字母到整数映射
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        String dict = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            if (i+2 < s.length() && s.charAt(i+2) == '#') {
                res.append(dict.charAt(Integer.valueOf(s.substring(i, i+2))-1));
                i+=2;
            } else {
                res.append(dict.charAt(Integer.valueOf(s.substring(i, i+1))-1));
            }
        }
        return res.toString();
    }
}
// @lc code=end

