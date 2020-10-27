/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i < amount + 1; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i -coins[j] >= 0 && dp[i-coins[j]] >= 0) {
                    temp = Math.min(temp, dp[i-coins[j]] + 1);
                }
            }
            if (temp == Integer.MAX_VALUE) dp[i] = -1;
            else dp[i] = temp;
        }
        return dp[amount];
    }
}
// @lc code=end

