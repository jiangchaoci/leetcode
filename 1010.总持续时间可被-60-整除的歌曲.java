/*
 * @lc app=leetcode.cn id=1010 lang=java
 *
 * [1010] 总持续时间可被 60 整除的歌曲
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] count = new int[60];
        for (int tim : time) {
            count[tim % 60]++;
        }
        int res = 0;
        int p = 1, q = 59;
        while (p < q) {
            if (count[p] > 0 && count[q] > 0)
                res += count[p] * count[q];
            p++;
            q--;
        }
        if (count[0] > 1)
            res += count[0] * (count[0] - 1) / 2;
        res += count[30] * (count[30] - 1) / 2;
        return res;
    }
}
// @lc code=end

