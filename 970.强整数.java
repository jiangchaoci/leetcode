/*
 * @lc app=leetcode.cn id=970 lang=java
 *
 * [970] 强整数
 */

// @lc code=start
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < bound; i++) {
            int cur = (int)Math.pow(x, i);
            if (cur > bound)
                break;
            for (int j = 0; j < bound; j++) {
                int cur1 = (int)Math.pow(y, j);
                if (cur + cur1 > bound)
                    break;
                res.add(cur + cur1);
            }
        }
        return new ArrayList<Integer>(res);
    }
}
// @lc code=end

