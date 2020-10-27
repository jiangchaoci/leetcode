import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=475 lang=java
 *
 * [475] 供暖器
 */

// @lc code=start
class Solution {
    private int findNearest(int n, int[] heaters) {
        int res = Integer.MAX_VALUE;
        for (int heater : heaters) {
            res = Math.min(res, Math.abs(n - heater));
        }
        return res;
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;
        for (int house : houses) {
            res = Math.max(res, findNearest(house, heaters));
        }
        return res;
    }
}
// @lc code=end

