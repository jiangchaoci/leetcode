/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */
import java.util.Stack;
// @lc code=start
class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3)
            return false;
        Stack<Integer> stack = new Stack<>();
        stack.push(A[0]);
        int i = 1;
        if (A[1] <= A[0])
            return false;
        for (i = 1; i < A.length-1; i++) {
            if (A[i] <= stack.peek()) {
                break;
            } else {
                stack.push(A[i]);
            }
        }
        for (; i < A.length; i++) {
            if (A[i] >= stack.peek()) {
                return false;
            } else {
                stack.push(A[i]);
            }
        }
        return true;
    }
}
// @lc code=end

