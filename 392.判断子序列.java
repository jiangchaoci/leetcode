/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int from = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = t.indexOf(c, from);
            if (index < 0) return false;
            else from = index + 1;
        }
        return true;
    }
}
// @lc code=end

