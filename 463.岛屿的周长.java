/*
 * @lc app=leetcode.cn id=463 lang=java
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1)
                        res--;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1)
                        res--;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1)
                        res--;
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1)
                        res--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

