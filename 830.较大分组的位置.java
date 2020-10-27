import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=830 lang=java
 *
 * [830] 较大分组的位置
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i-1)) {
                count++;
            } else {
                if (count >= 3) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i - count);
                    temp.add(i - 1);
                    res.add(temp);
                }
                count = 1;
            }
        }
        if (count >= 3) {
            List<Integer> temp = new ArrayList<>();
            temp.add(S.length() - count);
            temp.add(S.length() - 1);
            res.add(temp);
        }
        return res;
    }
}
// @lc code=end

