import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1051 lang=java
 *
 * [1051] 高度检查器
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i])
                res++;
        }
        return res;
    }
}
// @lc code=end

