/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int curX = 0, curY = 0, cur = 1, curD = 0;
        int[][] res = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        while (cur <= n*n) {
            res[curX][curY] = cur++;
            visited[curX][curY] = true;
            int nextX = curX + dir[curD][0];
            int nextY = curY + dir[curD][1];
            if (nextX >= 0 && nextX < n 
                && nextY >= 0 && nextY < n 
                && !visited[nextX][nextY]) {
                curX = nextX;
                curY = nextY;
            } else {
                curD = (curD+1)%4;
                curX += dir[curD][0];
                curY += dir[curD][1];
            }
        }
        return res;
    }
}
// @lc code=end

