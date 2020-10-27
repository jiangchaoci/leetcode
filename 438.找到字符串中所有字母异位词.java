import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    private boolean bijiao(int[] letters, int[] target) {
        for (int i = 0; i < 26; i++) {
            if (letters[i] != target[i])
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() == 0) return res;
        if (s.length() < p.length()) return res;
        int[] target = new int[26];
        for (int i = 0; i < p.length(); i++) {
            target[p.charAt(i) - 'a']++;
        }
        int left = 0, right = p.length() - 1;
        int[] letters = new int[26];
        for (int i = left; i <= right; i++) {
            letters[s.charAt(i) - 'a']++;
        }
        if (bijiao(letters, target))
            res.add(left);
        left++;
        right++;
        while (right < s.length()) {
            letters[s.charAt(right) - 'a']++;
            letters[s.charAt(left-1) - 'a']--;
            if (bijiao(letters, target))
                res.add(left);
            left++;
            right++;
        }
        return res;
    }
}
// @lc code=end

