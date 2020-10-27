/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        int first = 0, second = 1;
        for (int i = 2; i <= N; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
// @lc code=end

