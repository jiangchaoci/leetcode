/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = nums.length;
        int p = 0, q = 0, sum = 0;
        while (q < nums.length) {
            sum += nums[q++];
            while (sum >= s) {
                res = Math.min(res, q-p);
                sum -= nums[p++];
            }
        }
        if (res == nums.length) {
            int temp = 0;
            for (int num : nums)
                temp += num;
            if (temp < s)
                return 0;
        }
        return res;
    }
}
// @lc code=end

