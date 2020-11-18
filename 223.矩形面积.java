/*
 * @lc app=leetcode.cn id=223 lang=java
 *
 * [223] 矩形面积
 */

// @lc code=start
class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int width = 0, height = 0;
        if (A <= E) {
            width = (int)Math.max(0, (long)Math.min(G, C)-(long)E);
        } else {
            width = Math.max(0, Math.min(G, C)-A);
        }
        if (F <= B) {
            height = Math.max(0, Math.min(H, D)-B);
        } else {
            height = Math.max(0, Math.min(H, D)-F);
        }
        return (C-A)*(D-B) + (G-E)*(H-F) - width*height;
    }
}
// @lc code=end

