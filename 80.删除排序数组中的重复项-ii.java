/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int curIdx = 0, count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[curIdx]) {
                curIdx++;
                nums[curIdx] = nums[i];
                count = 0;
            } else {
                if (count < 1) {
                    curIdx++;
                    nums[curIdx] = nums[i];
                }
                count++;
            }
        }
        return curIdx+1;
    }
}
// @lc code=end

