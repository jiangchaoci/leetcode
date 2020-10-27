/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {

    public int arrangeCoins(int n) {
        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
        }
        return i - 1;
    }
}
// @lc code=end

