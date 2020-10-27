/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    //从start家打劫到end家
    private int myRob(int[] nums, int start, int end) {
        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++) {
            int temp = Math.max(first + nums[i], second);
            first = second;
            second = temp;
        }
        return second;
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);

        //不打劫最后一家
        int ans = myRob(nums, 0, nums.length - 1);
        //不打劫第一家
        int ans1 = myRob(nums, 1, nums.length);
        return Math.max(ans, ans1);
    }
}
// @lc code=end

