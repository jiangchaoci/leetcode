import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为K的子数组
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, pre = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (map.containsKey(pre - k))
                res += map.get(pre - k);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return res;
    }
}
// @lc code=end

