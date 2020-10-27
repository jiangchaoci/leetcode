/*
 * @lc app=leetcode.cn id=453 lang=java
 *
 * [453] 最小移动次数使数组元素相等
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
        }
        int moves = 0;
        for (int num : nums) {
            moves += num - min;
        }
        return moves;
    }
}
// @lc code=end

