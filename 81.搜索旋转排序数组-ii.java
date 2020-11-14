/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    private boolean helper(int[] nums, int target, int start, int end) {
        if (start > end) return false;
        boolean res = false;
        int mid = (start+end)/2;
        if (nums[mid] == target)
            return true;
        if (nums[mid] > target) {
            if (nums[mid] >= nums[end]) {
                if (helper(nums, target, mid+1, end))
                    return true;
            }
            if (helper(nums, target, start, mid-1))
                return true;
        } else {
            if (nums[mid] <= nums[start]) {
                if (helper(nums, target, start, mid-1))
                    return true;
            }
            if (helper(nums, target, mid+1, end))
                return true;
        }
        return res;
    }
    public boolean search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
}
// @lc code=end

