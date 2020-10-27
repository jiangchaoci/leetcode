/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int pre = 0;
        int cur = 0;
        while (cur < nums.length) {
            if (nums[cur] != 0) {
                int temp = nums[pre];
                nums[pre++] = nums[cur];
                nums[cur++] = temp;
            } else cur++;
        }
    }
}
// @lc code=end

