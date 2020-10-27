/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
// @lc code=end

