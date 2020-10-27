import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int cou = target - nums[i];
            if (map.containsKey(cou)) {
                res[0] = map.get(cou);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
// @lc code=end

