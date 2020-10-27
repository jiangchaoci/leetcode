/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int L = (int)Math.sqrt(area);
        int W = (int)Math.sqrt(area);
        if (L * W == area) return new int[]{L, W};
        L++;
        while (L * W != area) {
            if (L * W < area) L++;
            else if (L * W == area) return new int[]{L, W};
            else W--;
        }
        return new int[]{L, W};
    }
}
// @lc code=end

