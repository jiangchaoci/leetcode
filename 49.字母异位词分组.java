import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {

    private String toInt(String str) {
        int[] letter = new int[26];
        for (int i = 0; i < str.length(); i++) {
            letter[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int l : letter) 
            sb.append(l);
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String str : strs) {
            String key = toInt(str);
            if (map.containsKey(key)) {
                List<String> value = map.get(key);
                value.add(str);
                map.put(key, value);
            } else {
                List<String> value = new ArrayList<String>();
                value.add(str);
                map.put(key, value);
            }
        }
        for (List<String> list : map.values()) {
            res.add(list);
        }
        return res;
    }
}
// @lc code=end

