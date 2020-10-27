/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        if (nums[0] <= target)
            dp[0][nums[0]] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < target + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                } else if (j > nums[i]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[nums.length - 1][target];
    }
}
// @lc code=end

