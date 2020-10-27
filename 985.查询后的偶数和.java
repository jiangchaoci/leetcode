/*
 * @lc app=leetcode.cn id=985 lang=java
 *
 * [985] 查询后的偶数和
 */

// @lc code=start
class Solution {
    private int sum = 0;
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        for (int num : A) {
            if (num % 2 == 0)
                sum += num;
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
        }
    }
}
// @lc code=end

