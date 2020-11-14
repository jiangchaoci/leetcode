/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int curX = 0, curY = 0, index = 0, curD = 0;
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m*n];
        boolean[][] visited = new boolean[m][n];
        while (index < m *n) {
            res[index++] = matrix[curX][curY];
            visited[curX][curY] = true;
            int nextX = curX + dir[curD][0];
            int nextY = curY + dir[curD][1];
            if (nextX >= 0 && nextX < m 
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
        List<Integer> list = new ArrayList<>();
        for (int num : res) {
            list.add(num);
        }
        return list;
    }
}
// @lc code=end

