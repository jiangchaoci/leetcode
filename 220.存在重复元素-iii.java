import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=220 lang=java
 *
 * [220] 存在重复元素 III
 */

// @lc code=start
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && (long)s <= (long)nums[i] + t) return true;
    
            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && (long)nums[i] <= (long)g + t) return true;
    
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
// @lc code=end

