import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            num = Math.abs(num);
            if (nums[num - 1] > 0) nums[num - 1] *= -1;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) ans.add(i+1);
        }
        return ans;
    }
}
// @lc code=end

