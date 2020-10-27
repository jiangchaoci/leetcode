/*
 * @lc app=leetcode.cn id=840 lang=java
 *
 * [840] 矩阵中的幻方
 */

// @lc code=start
class Solution {
    private boolean check(int[][] grid, int si, int sj) {
        int[] count = new int[9];
        int sum = grid[si][sj] + grid[si][sj+1] + grid[si][sj+2];
        for (int i = si + 1; i < si + 3; i++) {
            int temp = 0;
            for (int j = sj; j < sj + 3; j++) {
                temp += grid[i][j];
            }
            if (temp != sum)
                return false;
        }
        for (int j = sj; j < sj + 3; j++) {
            int temp = 0;
            for (int i = si; i < si + 3; i++) {
                temp += grid[i][j];
                if (grid[i][j] < 1 || grid[i][j] > 9)
                    return false;
                count[grid[i][j]-1]++;
            }
            if (temp != sum)
                return false;
        }
        for (int i = 0; i < 9; i++) {
            if (count[i] != 1)
                return false;
        }
        int temp = grid[si][sj] + grid[si+1][sj+1] + grid[si+2][sj+2];
        if (temp != sum)
            return false;
        temp = grid[si+2][sj] + grid[si+1][sj+1] + grid[si][sj+2];
        if (temp != sum)
            return false;
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 0; i <= m - 3; i++) {
            for (int j = 0; j <= n - 3; j++) {
                if (check(grid, i, j))
                    res++;
            }
        }
        return res;
    }
}
// @lc code=end

