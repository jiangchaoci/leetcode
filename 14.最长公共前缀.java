/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) return sb.toString();
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen)
                minLen = str.length();
        }
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c)
                    return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

