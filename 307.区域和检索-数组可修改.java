/*
 * @lc app=leetcode.cn id=307 lang=java
 *
 * [307] 区域和检索 - 数组可修改
 */

// @lc code=start
class NumArray {
    private int[] dp;
    private int[] tNums;

    public NumArray(int[] nums) {
        dp = new int[nums.length + 1];
        tNums = new int[nums.length];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i-1] + nums[i-1];
            tNums[i-1] = nums[i-1];
        }
    }
    
    public void update(int i, int val) {
        int dif = val - tNums[i];
        for (int j = i; j < )
    }
    
    public int sumRange(int i, int j) {
        return dp[j+1] - dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
// @lc code=end

