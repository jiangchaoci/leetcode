/*
 * @lc app=leetcode.cn id=1295 lang=java
 *
 * [1295] 统计位数为偶数的数字
 */

// @lc code=start
class Solution {
    private boolean check(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        if (count % 2 == 0)
            return true;
        return false;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (check(num))
                res++;
        }
        return res;
    }
}
// @lc code=end

