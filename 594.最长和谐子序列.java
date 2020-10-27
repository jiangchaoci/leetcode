import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int key: map.keySet()) {
            if (map.containsKey(key+1)) {
                int temp = map.get(key) + map.getOrDefault(key+1, 0);
                res = Math.max(res, temp);
            }
        }
        return res;
    }
}
// @lc code=end

