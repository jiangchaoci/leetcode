/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i) - 'a']--;
        }
        char c = ' ';
        for (int i = 0; i < 26; i++) {
            if (letters[i] == -1) c = (char)('a' + i);
        }
        return c;
    }
}
// @lc code=end

