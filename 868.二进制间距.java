/*
 * @lc app=leetcode.cn id=868 lang=java
 *
 * [868] 二进制间距
 */

// @lc code=start
class Solution {
    public int binaryGap(int N) {
        int[] temp = new int[32];
        int index = 0;
        while (N > 0) {
            temp[index++] = N % 2;
            N = N >> 1;
        }
        int pre = -1;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (temp[i] == 1) {
                if (pre != -1) {
                    res = Math.max(res, i - pre);
                }
                pre = i;
            }
        }
        return res;
    }
}
// @lc code=end

