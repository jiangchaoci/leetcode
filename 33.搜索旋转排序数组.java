/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    private int helper(int[] nums, int target, int start, int end) {
        if (start > end) return -1;
        int res = -1;
        int mid = (start+end)/2;
        if (nums[mid] == target)
            return mid;
        if (nums[mid] > target) {
            if (nums[mid] > nums[end]) {
                res = Math.max(res, helper(nums, target, mid+1, end));
            }
            res = Math.max(res, helper(nums, target, start, mid-1));
        } else {
            if (nums[mid] < nums[start]) {
                res = Math.max(res, helper(nums, target, start, mid-1));
            }
            res = Math.max(res, helper(nums, target, mid+1, end));
        }
        return res;
    }
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
}
// @lc code=end

