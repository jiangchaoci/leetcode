import java.util.List;

/*
 * @lc app=leetcode.cn id=1021 lang=java
 *
 * [1021] 删除最外层的括号
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String S) {
        int[] count = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (count[0] == count[1]) {
                list.add(i);
                count[0] = 0;
                count[1] = 0;
            }
            if (S.charAt(i) == '(')
                count[0] ++;
            else
                count[1] ++;
        }
        list.add(S.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            int from = list.get(i);
            int to = list.get(i+1);
            sb.append(S.substring(from+1, to-1));
        }
        return sb.toString();
    }
}
// @lc code=end

