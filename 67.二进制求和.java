/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int p = a.length() - 1;
        int q = b.length() - 1;
        while (p >= 0 || q >= 0) {
            int numa = p >= 0 ? (a.charAt(p) - '0') : 0;
            int numb = q >= 0 ? (b.charAt(q) - '0') : 0;
            int num = numa + numb + carry;
            carry = num / 2;
            num = num % 2;
            sb.append(Integer.toString(num));
            p--;
            q--;
        }
        if (carry > 0) sb.append("1");
        return sb.reverse().toString();
    }
}
// @lc code=end

