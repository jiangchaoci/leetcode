import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */

// @lc code=start
class Solution {
    private int distance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int count = map.getOrDefault(distance(points[i], points[j]), 0);
                    map.put(distance(points[i], points[j]), count + 1);
                }
            }
            for (int k : map.values()) {
                if (k > 1) ans += k * (k - 1);
            }
            map.clear();;
        }
        return ans;
    }
}
// @lc code=end

