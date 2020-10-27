/*
 * @lc app=leetcode.cn id=832 lang=java
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int l = 0, r = A[i].length - 1;
            while (l < r) {
                int temp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }
        return A;
    }
}
// @lc code=end

