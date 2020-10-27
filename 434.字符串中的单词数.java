/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        boolean flag = false;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                flag = true;
            } else if (s.charAt(i) == ' ' && flag) {
                flag = false;
                ans++;
            }
        }
        if (flag) ans++;
        return ans;
    }
}
// @lc code=end

