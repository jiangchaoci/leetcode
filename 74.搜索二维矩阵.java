/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        if (n == 0) return false;
        int i = 0;
        for (; i < m; i++) {
            if (matrix[i][0] == target) {
                return true;
            } else if (matrix[i][0] > target) {
                break;
            }
        }
        if (i == 0) return false;
        i--;
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == target)
                return true;
        }
        return false;
    }
}
// @lc code=end

