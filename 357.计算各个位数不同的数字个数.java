/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 计算各个位数不同的数字个数
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        n = Math.min(n, 10);
        int res = 10, base = 9, ev = 9;
        for (int i = 1; i < n; i++) {
            ev *= base--;
            res += ev;
        }
        return res;
    }
}
// @lc code=end

