import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=893 lang=java
 *
 * [893] 特殊等价字符串组
 */

// @lc code=start
class Solution {
    private String getKey(String str) {
        int[] ji = new int[26];
        int[] ou = new int[26];
        for (int i = 0; i < str.length(); i+=2) {
            ji[str.charAt(i)-'a']++;
        }
        for (int i = 1; i < str.length(); i+=2) {
            ou[str.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(ji[i]);
            sb.append(ou[i]);
        }
        return sb.toString();
    }

    public int numSpecialEquivGroups(String[] A) {
        int res = 0;
        Set<String> set = new HashSet<>();
        for (String str : A) {
            String temp = getKey(str);
            if (!set.contains(temp)) {
                res++;
                set.add(temp);
            }
        }
        return res;
    }
}
// @lc code=end

