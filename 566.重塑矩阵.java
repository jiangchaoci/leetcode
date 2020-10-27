/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) return nums;
        int[] temp = new int[r * c];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                temp[k] = nums[i][j];
                k++;
            }
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = temp[i * c + j];
            }
        }
        return res;
    }
}
// @lc code=end

