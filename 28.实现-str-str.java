/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i < m - n+1; i++) {
            int flag = 1;
            for (int j = i; j < i+n; j++) {
                if (haystack.charAt(j) != needle.charAt(j-i)) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) return i;
        }
        return -1;
    }
}
// @lc code=end

