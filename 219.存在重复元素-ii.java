import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int left = 0;
        int right = k;
        for (int i = 0; i < Math.min(nums.length, k); i++) {
            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        while (right < nums.length) {
            if (set.contains(nums[right])) return true;
            else {
                set.add(nums[right]);
                set.remove(nums[left]);
                left++;
                right++;
            }
        }
        return false;
    }
}
// @lc code=end

