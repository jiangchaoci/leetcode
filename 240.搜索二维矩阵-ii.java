/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        if (r == 0) return false;
        int c = matrix[0].length;
        if (c == 0) return false;
        /*int row = r - 1;
        int col = 0;
        while (row >= 0 && col < c) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] == target) {
                return true;
            } else {
                col++;
            }
        }*/
        int row = 0;
        int col = c - 1;
        while (row < r && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] == target) {
                return true;
            } else {
                row++;
            }
        }
        return false;
    }
}
// @lc code=end

