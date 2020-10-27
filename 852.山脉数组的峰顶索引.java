/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int l = 1;
        while (l < A.length && A[l] > A[l-1])
            l++;
        return l-1;
    }
}
// @lc code=end

