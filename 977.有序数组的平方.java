/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++)
            res[i] = A[i] * A[i];
        Arrays.sort(res);
        return res;
    }
}
// @lc code=end

