/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = Integer.MIN_VALUE;
        int cur = 0;
        while (cur < nums.length) {
            int count = 0;
            while (cur < nums.length && nums[cur] == 1) {
                count++;
                cur++;
            }
            res = Math.max(res, count);
            cur++;
        }
        return res;
    }
}
// @lc code=end

