/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    private int popCount(int num) {
        int res = 0;
        while (num > 0) {
            num = num & (num - 1);
            res++;
        }
        return res;
    }
    public int[] countBits(int num) {
        int[] res = new int [num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = popCount(i);
        }
        return res;
    }
}
// @lc code=end

