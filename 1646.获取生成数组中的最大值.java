/*
 * @lc app=leetcode.cn id=1646 lang=java
 *
 * [1646] 获取生成数组中的最大值
 */

// @lc code=start
class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        int res = 1;
        int[] temp = new int[n+1];
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i%2 == 0) {
                temp[i] = temp[i/2];
            } else {
                temp[i] = temp[i/2] + temp[i/2+1];
            }
        }
        for (int i = 0; i <= n; i++)
            res = Math.max(res, temp[i]);
        return res;
    }
}
// @lc code=end

