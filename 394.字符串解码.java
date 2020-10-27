/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<String> strs = new Stack<String>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder temp = new StringBuilder();
                temp.append(c);
                while (Character.isDigit(s.charAt(i+1))) {
                    temp.append(s.charAt(i+1));
                    i++;
                }
                nums.push(Integer.valueOf(temp.toString()));
            } 
            else if (c == ']') {
                List<String> temp = new ArrayList();
                StringBuilder temp1 = new StringBuilder();
                while (!strs.peek().equals("[")) {
                    temp.add(strs.pop());
                }
                strs.pop();
                Collections.reverse(temp);
                StringBuilder sb = new StringBuilder();
                for (String st : temp) {
                    sb.append(st);
                }
                int times = nums.pop();
                for (int j = 0; j < times; j++) {
                    temp1.append(sb);
                }
                strs.push(temp1.toString());
            } else {
                strs.push(String.valueOf(c));
            }
        }
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }
}
// @lc code=end

