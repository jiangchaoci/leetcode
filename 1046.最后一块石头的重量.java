import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while (n >= 2) {
            Arrays.sort(stones, 0, n);
            int a = stones[n-1], b = stones[n-2];
            if (a == b) {
                n-=2;
            } else {
                stones[n-2] = Math.abs(a-b);
                n--;
            }
        }
        if (n == 0)
            return 0;
        return stones[0];
    }
}
// @lc code=end

