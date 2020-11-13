import java.util.Set;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int curIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[curIdx]) {
                curIdx++;
                nums[curIdx] = nums[i];
            }
        }
        return curIdx+1;
    }
}
// @lc code=end

