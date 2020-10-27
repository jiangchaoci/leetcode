import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else if (c == ')') {
                if (stack.empty()) return false;
                else {
                    char temp = stack.pop();
                    if (temp != '(') return false;
                }
            } else if (c == '}') {
                if (stack.empty()) return false;
                else {
                    char temp = stack.pop();
                    if (temp != '{') return false;
                }
            } else if (c == ']') {
                if (stack.empty()) return false;
                else {
                    char temp = stack.pop();
                    if (temp != '[') return false;
                }
            } else return false;
        }
        if (!stack.empty()) return false;
        return true;
    }
}
// @lc code=end

