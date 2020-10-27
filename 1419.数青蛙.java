/*
 * @lc app=leetcode.cn id=1419 lang=java
 *
 * [1419] 数青蛙
 */

// @lc code=start
class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs.length() % 5 != 0) return -1;
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int res = 0;
        for (int i = 0; i < croakOfFrogs.length(); i++) {
            switch (croakOfFrogs.charAt(i)) {
                case 'c':
                    c++;
                    res = Math.max(res, c - k);
                    break;
                case 'r':
                    r++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'k':
                    k++;
                    break;
                default:
                    return -1;
            }
            if (c < r || r < o || o < a || a < k)
                return -1;
        }
        return res;
    }
}
// @lc code=end

