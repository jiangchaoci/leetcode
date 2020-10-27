/*
 * @lc app=leetcode.cn id=1009 lang=java
 *
 * [1009] 十进制整数的反码
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0)
            return 1;
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            sb.append(N % 2);
            N /= 2;
        }
        int res = 0;
        int cur = 1;
        for (int i = 0; i < sb.length(); i++) {
            res += cur * (1 - sb.charAt(i) + '0');
            cur *= 2;
        }
        return res;
    }
}
// @lc code=end

