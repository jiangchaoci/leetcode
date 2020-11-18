import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=274 lang=java
 *
 * [274] H 指数
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int cita : citations)
            map.put(cita, map.getOrDefault(cita, 0)+1);
        int[][] count = new int[map.size()][2];
        int cur = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count[cur][0] = entry.getKey();
            count[cur++][1] = entry.getValue();
        }
        Arrays.sort(count, (a, b)->b[0]-a[0]);
        int sum = 0;
        for (int[] c : count) {
            if (sum > c[0])
                break;
            sum += c[1];
            if (sum >= c[0])
                return c[0];
        }
        return sum;
    }
}
// @lc code=end

