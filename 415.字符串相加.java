/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (p1 >= 0 || p2 >= 0) {
            int n1 = p1 >= 0 ? (num1.charAt(p1--) - '0') : 0;
            int n2 = p2 >= 0 ? (num2.charAt(p2--) - '0') : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        if (carry == 1) sb.append("1");
        return sb.reverse().toString();
    }
}
// @lc code=end

