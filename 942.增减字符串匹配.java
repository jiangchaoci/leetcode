/*
 * @lc app=leetcode.cn id=942 lang=java
 *
 * [942] 增减字符串匹配
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        int inc = 0;
        int des = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                res[i] = inc++;
            } else {
                res[i] = des--;
            }
        }
        res[S.length()] = inc;
        return res;
    }
}
// @lc code=end

