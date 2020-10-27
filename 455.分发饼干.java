import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = 0;
        int p2 = 0;
        int res = 0;
        while (p1 < g.length && p2 < s.length) {
            if (g[p1] <= s[p2]) {
                res++;
                p1++;
            }
            p2++;
        }
        return res;
    }
}
// @lc code=end

