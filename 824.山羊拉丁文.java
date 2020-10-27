import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=824 lang=java
 *
 * [824] 山羊拉丁文
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        char[] yy = new char[]{'a', 'e', 'i', 'o', 'u', 
        'A', 'E', 'I', 'O', 'U'};
        HashSet<Character> set = new HashSet<>();
        for (char c : yy) {
            set.add(c);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (set.contains(str[i].charAt(0))) {
                res.append(str[i] + "ma");
                for (int j = 0; j <= i; j++) {
                    res.append("a");
                }
                res.append(" ");
            } else {
                res.append(str[i].substring(1, str[i].length()) 
                + str[i].charAt(0) + "ma");
                for (int j = 0; j <= i; j++) {
                    res.append("a");
                }
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
}
// @lc code=end

