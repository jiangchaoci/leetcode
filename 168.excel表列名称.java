/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n -= 1;
            char c = (char)('A' + n % 26);
            sb.append(c);
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

