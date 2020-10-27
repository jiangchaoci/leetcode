/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            } else {
                sb2.append(T.charAt(i));
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}
// @lc code=end

