/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        char[] letters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c',
            'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(letters[num & 0x0f]);
            num >>= 4;
        }
        String str = sb.reverse().toString();
        int index = 7;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                index = i;
                break;
            }
        }
        return str.substring(index, str.length());
    }
}
// @lc code=end

