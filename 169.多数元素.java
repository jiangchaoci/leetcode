import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            if (count > len / 2) {
                ans = num;
                break;
            }
            map.put(num, count);
        }
        return ans;
    }
}
// @lc code=end

