/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0, right = nums.length - 1;
        int first = Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE;
        while (left < nums.length && nums[left] >= first)
            first = nums[left++];
        while (right >= 0 && nums[right] <= last)
            last = nums[right--];
        if (left - 1 >= right + 1) return 0;
        return right - left + 3; 
    }
}
// @lc code=end

