/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */
import java.util.Stack;
// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int num2 = Integer.valueOf(stack.pop());
                int num1 = Integer.valueOf(stack.pop());
                int temp = num1 + num2;
                stack.push(String.valueOf(temp));
            } else if (token.equals("-")) {
                int num2 = Integer.valueOf(stack.pop());
                int num1 = Integer.valueOf(stack.pop());
                int temp = num1 - num2;
                stack.push(String.valueOf(temp));
            } else if (token.equals("*")) {
                int num2 = Integer.valueOf(stack.pop());
                int num1 = Integer.valueOf(stack.pop());
                int temp = num1 * num2;
                stack.push(String.valueOf(temp));
            } else if (token.equals("/")) {
                int num2 = Integer.valueOf(stack.pop());
                int num1 = Integer.valueOf(stack.pop());
                int temp = num1 / num2;
                stack.push(String.valueOf(temp));
            } else {
                stack.push(token);
            }
        }
        return Integer.valueOf(stack.peek());
    }
}
// @lc code=end

