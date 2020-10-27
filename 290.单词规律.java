import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) map.put(c, count++);
        }
        count = 0;
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (!map1.containsKey(strs[i]))
            map1.put(strs[i], count++);
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < pattern.length(); i++) {
            sb.append(map.get(pattern.charAt(i)));
        }
        for (int i = 0; i < strs.length; i++) {
            sb1.append(map1.get(strs[i]));
        }
        return sb.toString().equals(sb1.toString());
    }
}
// @lc code=end

