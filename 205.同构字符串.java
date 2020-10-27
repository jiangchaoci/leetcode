import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), count++);
            }
        }
        count = 0;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (!map1.containsKey(t.charAt(i))) {
                map1.put(t.charAt(i), count++);
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(map.get(s.charAt(i)));
        }
        for (int i = 0; i < t.length(); i++) {
            sb1.append(map1.get(t.charAt(i)));
        }
        return sb.toString().equals(sb1.toString());
    }
}
// @lc code=end

