/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num == first) {
                continue; 
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num == second) {
                continue;
            } else if (num > third) {
                third = num;
            }
        }
        int ans = 0;
        if (third == Long.MIN_VALUE)
            ans = (int)first;
        else ans = (int)third;
        return ans;
    }
}
// @lc code=end

