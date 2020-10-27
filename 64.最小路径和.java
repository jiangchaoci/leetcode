/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dis = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        dis[i][j] = grid[i][j];
                    } else {
                        dis[i][j] = dis[i][j-1] + grid[i][j];
                    }
                } else {
                    if (j == 0) {
                        dis[i][j] = dis[i-1][j] + grid[i][j];
                    } else {
                        dis[i][j] = Math.min(dis[i][j-1], dis[i-1][j]) + grid[i][j];
                    }
                }
            }
        }
        return dis[grid.length-1][grid[0].length-1];
    }
}
// @lc code=end

