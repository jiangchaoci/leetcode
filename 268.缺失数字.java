/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = (1 + nums.length) * nums.length / 2;
        for (int i = 0; i < nums.length; i++)
            sum -= nums[i];
        return sum;
    }
}
// @lc code=end

