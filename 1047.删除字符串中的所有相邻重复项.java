/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String S) {
        boolean flag = true;
        while (flag) {
            flag = false;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (; i < S.length()-1; i++) {
                if (S.charAt(i) == S.charAt(i+1)) {
                    i+=2;
                    flag = true;
                    break;
                } else {
                    sb.append(S.charAt(i));
                }
            }
            for (; i < S.length(); i++) {
                sb.append(S.charAt(i));
            }
            S = sb.toString();
        }
        return S;
    }
}
// @lc code=end

