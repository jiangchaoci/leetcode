import java.util.List;

/*
 * @lc app=leetcode.cn id=849 lang=java
 *
 * [849] 到最近的人的最大距离
 */

// @lc code=start
class Solution {
    public int maxDistToClosest(int[] seats) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1)
                list.add(i);
        }
        int res = 0;
        for (int i = 1; i < list.size(); i++) {
            res = Math.max(res, (list.get(i) - list.get(i-1)) / 2);
        }
        res = Math.max(res, list.get(0));
        res = Math.max(res, seats.length-1 - list.get(list.size()-1));
        return res;
    }
}
// @lc code=end

