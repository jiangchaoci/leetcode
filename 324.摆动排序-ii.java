/*
 * @lc app=leetcode.cn id=324 lang=java
 *
 * [324] 摆动排序 II
 */

// @lc code=start
class Solution {
    public void wiggleSort(int[] nums) {
        if (nums.length <= 1)
            return;
        Arrays.sort(nums);
        int count = 0;
        if (nums[(nums.length-1)/2] == nums[(nums.length+1)/2]) {
            int tar = nums[(nums.length-1)/2];
            for (int num : nums) {
                if (num == tar)
                    count++;
            }
        }
        int[] temp = new int[nums.length];
        if (count >= (nums.length+1)/2) {
            for (int i = 0; i < (nums.length+1)/2; i++) {
                temp[2*i] = nums[(nums.length-1)/2-i];
            }
            for (int i = 0; i < nums.length/2; i++) {
                temp[2*i+1] = nums[nums.length-1-i];
            }
        } else {
            for (int i = 0; i < (nums.length+1)/2; i++) {
                temp[2*i] = nums[i];
            }
            for (int i = (nums.length+1)/2; i < nums.length; i++) {
                temp[2*(i-((nums.length+1)/2))+1] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = temp[i];
    }
}
// @lc code=end

