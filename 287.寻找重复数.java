import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int pre = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == pre)
                return num;
            pre = num;
        }
        return -1;
    }
}
// @lc code=end

