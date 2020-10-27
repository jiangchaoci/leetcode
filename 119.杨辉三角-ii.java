/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] ans = new int[rowIndex + 1];
        int[] ans1 = new int[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            ans1[0] = 1;
            for (int j = 1; j < i; j++) {
                ans1[j] = ans[j-1] + ans[j];
            }
            ans1[i] = 1;
            for (int j = 0; j <= i; j++) {
                ans[j] = ans1[j];
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int num : ans1) {
            res.add(num);
        }
        return res;
    }
}
// @lc code=end

