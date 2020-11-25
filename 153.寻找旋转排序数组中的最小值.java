/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < res)
                res = num;
        }
        return res;
    }
}
// @lc code=end

