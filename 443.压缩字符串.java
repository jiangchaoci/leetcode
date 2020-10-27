/*
 * @lc app=leetcode.cn id=443 lang=java
 *
 * [443] 压缩字符串
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        int pre = 0;
        int cur = 0;
        char c = chars[0];
        while (cur < chars.length) {
            int count = 0;
            while (cur < chars.length && chars[cur] == c) {
                cur++;
                count++;
            }
            chars[pre++] = c;
            if (count > 1) {
                int left = pre;
                while (count > 0) {
                    chars[pre++] = (char)('0' + count % 10);
                    count /= 10;
                }
                int right = pre - 1;
                while (left < right) {
                    char temp = chars[left];
                    chars[left++] = chars[right];
                    chars[right--] = temp;
                }
            }
            if (cur < chars.length) c = chars[cur];
        }
        return pre;
    }
}
// @lc code=end

