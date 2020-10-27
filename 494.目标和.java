/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    private int res = 0;
    private void dfs(int[] nums, int start, int target) {
        if (start == nums.length) {
            if (target == 0)
                res++;
        } else if (start > nums.length)
            return;
        else {
            dfs(nums, start + 1, target + nums[start]);
            dfs(nums, start + 1, target - nums[start]);
        }
    }
    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return res;
    }
}
// @lc code=end

