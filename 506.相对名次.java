import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] nums1 = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], nums1.length - i);
        }
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = map.get(nums[i]);
            if (num == 1) {
                res[i] = "Gold Medal";
            } else if (num == 2) {
                res[i] = "Silver Medal";
            } else if (num == 3) {
                res[i] = "Bronze Medal";
            } else {
                res[i] = String.valueOf(num);
            }
        }
        return res;
    }
}
// @lc code=end

