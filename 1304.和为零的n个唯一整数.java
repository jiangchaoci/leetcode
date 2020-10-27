/*
 * @lc app=leetcode.cn id=1304 lang=java
 *
 * [1304] 和为零的N个唯一整数
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int cur = 1;
        for (int i = 0; i < n/2; i++) {
            res[2*i] = cur;
            res[2*i+1] = -cur;
            cur++;
        }
        if (n % 2 == 1) {
            res[n-1] = 0;
        }
        return res;
    }
}
// @lc code=end

