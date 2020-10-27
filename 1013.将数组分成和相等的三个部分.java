/*
 * @lc app=leetcode.cn id=1013 lang=java
 *
 * [1013] 将数组分成和相等的三个部分
 */

// @lc code=start
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int num : A)
            sum += num;
        if (sum % 3 != 0)
            return false;
        int p = 0, q = A.length - 1;
        int temp = 0;
        while (p < A.length) {
            temp += A[p];
            if (temp == sum / 3)
                break;
            p++;
        }
        temp = 0;
        while (q >= 0) {
            temp += A[q];
            if (temp == sum / 3)
                break;
            q--;
        }
        return p + 1 < q;
    }
}
// @lc code=end

